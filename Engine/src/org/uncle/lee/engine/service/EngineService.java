package org.uncle.lee.engine.service;

import org.uncle.lee.engine.pure.RealEngine;
import org.uncle.lee.engine.pure.RealEngineListener;
import org.uncle.lee.engine.service.aidl.EngineServiceListener;
import org.uncle.lee.engine.service.aidl.EngineServiceOperator;
import org.uncle.lee.engine.service.aidl.EngineServiceOperator.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class EngineService extends Service {
	private EngineServiceListener serviceListener;
	
	@Override
	public IBinder onBind(Intent intent) {
		return engineOperator;
	}
	
	private final EngineServiceOperator.Stub engineOperator = new Stub() {
		@Override
		public void setListener(EngineServiceListener listener)
				throws RemoteException {
			EngineService.this.serviceListener = listener;
		}
		
		@Override
		public void initEngine() throws RemoteException {
			// do some blocking things ...
			RealEngine realEngine = new RealEngine();
			realEngine.setListener(engineListener);
			realEngine.init();
		}
		
		@Override
		public void doClick() throws RemoteException {
			
		}
	};
	
	private RealEngineListener engineListener = new RealEngineListener() {
		@Override
		public void onInitDone() {
			try {
				EngineService.this.serviceListener.onInitDone();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	};
}
