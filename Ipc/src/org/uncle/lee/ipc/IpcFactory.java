package org.uncle.lee.ipc;

import org.uncle.lee.ipc.pipeline.PipelineManager;

public class IpcFactory {
	private static IpcFactory ipcFactoryInstance;
	private PipelineManager pipelineManager;
	
	private IpcFactory(){
		pipelineManager = new PipelineManager();
	};
	
	public static IpcFactory getInstance(){
		if(ipcFactoryInstance == null){
			synchronized (IpcFactory.class) {
				if(ipcFactoryInstance == null){
					ipcFactoryInstance = new IpcFactory();
				}
			}
		}
		return ipcFactoryInstance;		
	}
	
	public PipelineManager createPipeLineManager(){
		return pipelineManager;
	}
}
