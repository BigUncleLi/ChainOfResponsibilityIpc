package org.uncle.lee.ipc.pipeline;

public class PipelineManager {
	private ClientPipeline clientPipeline;
	private Pipeline enginePipeline;

	public PipelineManager() {
		initClientPipeline();
		initEnginePipeline();
	}
	
	private void initClientPipeline() {
		clientPipeline = new ClientPipeline();
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
