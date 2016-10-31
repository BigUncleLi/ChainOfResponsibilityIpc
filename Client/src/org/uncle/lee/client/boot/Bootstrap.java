package org.uncle.lee.client.boot;

import org.uncle.lee.engine.Engine;
import org.uncle.lee.engine.XEngine;
import org.uncle.lee.ipc.IpcFactory;
import org.uncle.lee.ipc.pipeline.Pipeline;
import org.uncle.lee.ipc.pipeline.PipelineManager;

public class Bootstrap {
	public void init(){
		Engine engine = new XEngine();
		PipelineManager pipelineManager = IpcFactory.getInstance(engine).createPipeLineManager();
		initClientPipeline(pipelineManager.clientPipeline());
		initEnginePipeline(pipelineManager.enginePipeline());
	}

	private void initEnginePipeline(Pipeline enginePipeline) {
		
	}

	private void initClientPipeline(Pipeline clientPipeline) {
		
	}
}
