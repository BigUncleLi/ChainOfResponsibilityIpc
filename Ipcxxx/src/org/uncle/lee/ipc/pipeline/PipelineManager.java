package org.uncle.lee.ipc.pipeline;

import org.uncle.lee.engine.Engine;

public class PipelineManager {
	private ClientPipeline clientPipeline;
	private Pipeline enginePipeline;

	public PipelineManager(Engine engine) {
		initClientPipeline(engine);
		initEnginePipeline();
	}
	
	private void initClientPipeline(Engine engine) {
		clientPipeline = new ClientPipeline(engine);
	}
	
	private void initEnginePipeline() {
		enginePipeline = new EnginePipeline();
	}

	public ClientPipeline clientPipeline(){
		return clientPipeline;
	}

	public Pipeline enginePipeline(){
		return enginePipeline;
	}
}
