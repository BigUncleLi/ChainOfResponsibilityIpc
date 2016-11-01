package org.uncle.lee.ipc;

import org.uncle.lee.ipc.pipeline.PipelineManager;

import android.content.Context;

public class IpcFactory {
	private static IpcFactory ipcFactoryInstance;
	private PipelineManager pipelineManager;
	
	private IpcFactory(Context mContext){
		initServiceTool(mContext);
		pipelineManager = new PipelineManager();
	};
	
	private void initServiceTool(Context mContext) {
		ServiceTool.getInstance(mContext).connectService();
	}

	public static IpcFactory getInstance(Context mContext){
		if(ipcFactoryInstance == null){
			synchronized (IpcFactory.class) {
				if(ipcFactoryInstance == null){
					ipcFactoryInstance = new IpcFactory(mContext);
				}
			}
		}
		return ipcFactoryInstance;
	}
	
	public PipelineManager createPipeLineManager(){
		return pipelineManager;
	}
}
