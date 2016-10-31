package org.uncle.lee.ipc;

import org.uncle.lee.engine.Engine;
import org.uncle.lee.ipc.pipeline.PipelineManager;

public class IpcFactory {
	private static IpcFactory ipcFactoryInstance;
	private PipelineManager pipelineManager;
	
	private IpcFactory(Engine engine){
		pipelineManager = new PipelineManager(engine);
	};
	
	public static IpcFactory getInstance(Engine engine){
		if(ipcFactoryInstance == null){
			synchronized (IpcFactory.class) {
				if(ipcFactoryInstance == null){
					ipcFactoryInstance = new IpcFactory(engine);
				}
			}
		}
		return ipcFactoryInstance;		
	}
	
	public PipelineManager createPipeLineManager(){
		return pipelineManager;
	}
}
