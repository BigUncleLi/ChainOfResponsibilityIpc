
package org.uncle.lee.client.service;

import org.uncle.lee.client.boot.Bootstrap;
import org.uncle.lee.command.Command;
import org.uncle.lee.command.client.ClientCommand;
import org.uncle.lee.ipc.pipeline.PipelineManager;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class ClientService extends Service {
	
	private PipelineManager pipelineManager;

	@Override
	public void onCreate() {
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.init();
		pipelineManager = bootstrap.pipelineManager();
	}

	@Override
	public IBinder onBind(Intent intent) {
		return new ServcieOperator();
	}
	
	public final class ServcieOperator extends Binder{
		public void requestPipeline(ClientCommand command){
			ClientService.this.requestPipeline(command);
		}
	}
	
	private void requestPipeline(ClientCommand command){
		pipelineManager.clientPipeline().request(command);
	}
	
	@Override
	public void onDestroy() {
	}
}
