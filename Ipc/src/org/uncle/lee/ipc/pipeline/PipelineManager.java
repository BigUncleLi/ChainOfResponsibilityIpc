package org.uncle.lee.ipc.pipeline;

import org.uncle.lee.engine.Engine;

public class PipelineManager {
	private Pipeline clientPipeline;
	private Pipeline enginePipeline;

	public PipelineManager(Engine engine) {
	}
	
	public Pipeline clientPipeline(){
		return clientPipeline;
	}

	public Pipeline enginePipeline(){
		return enginePipeline;
	}
}
