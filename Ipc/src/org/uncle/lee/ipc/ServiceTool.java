package org.uncle.lee.ipc;

import org.uncle.lee.common.preference.EngineConstant;
import org.uncle.lee.engine.service.aidl.EngineServiceListener;
import org.uncle.lee.engine.service.aidl.EngineServiceOperator;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

public class ServiceTool {
	private static ServiceTool tool;
	private Context mContext;
	private EngineServiceOperator serviceOperator;
	
	private ServiceTool(Context mContext){
		this.mContext = mContext;
	}
	
	public static ServiceTool getInstance(Context mContext){
		if (tool == null){
			synchronized (ServiceTool.class) {
				if (tool == null){
					tool = new ServiceTool(mContext);
				}
			}
		}
		return tool;
	}
	
	public void connectService(){
		Intent engineService = new Intent(EngineConstant.ENGINE_SERVICE_ACTION);
		mContext.bindService(engineService, conn, Context.BIND_AUTO_CREATE);
	}
	
	private final ServiceConnection conn = new ServiceConnection() {
		@Override
		public void onServiceDisconnected(ComponentName name) {
			serviceOperator = null;
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			serviceOperator = EngineServiceOperator.Stub.asInterface(service);
			try {
				serviceOperator.setListener(serviceListener);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	};
	
	public EngineServiceOperator getServiceOperator(){
		if (serviceOperator == null){
			throw new RuntimeException("ServiceTool must connect first !");
		} else {
			return serviceOperator;
		}
	}
	
	private EngineServiceListener serviceListener = new EngineServiceListener(){

		@Override
		public IBinder asBinder() {
			return null;
		}

		@Override
		public void onInitDone() throws RemoteException {
			
		}
		
	};
}
