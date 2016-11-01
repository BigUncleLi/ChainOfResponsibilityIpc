package org.uncle.lee.client;

import org.uncle.lee.client.perference.ClientConstant;
import org.uncle.lee.client.service.ClientService.ServcieOperator;
import org.uncle.lee.command.client.ClickCommand;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

public class MainActivity extends Activity {
	private ServcieOperator serviceOperator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		connectClientService();
	}

	private void connectClientService() {
		Intent clientService = new Intent(ClientConstant.CLIENT_SERVICE_ACTION);
		this.bindService(clientService, conn, Context.BIND_AUTO_CREATE);
	}
	
	private final ServiceConnection conn = new ServiceConnection() {
		@Override
		public void onServiceDisconnected(ComponentName name) {
			
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			serviceOperator = (ServcieOperator) service;
		}
	};
	
	public void onclick(){
		serviceOperator.requestPipeline(new ClickCommand());
	}
}
