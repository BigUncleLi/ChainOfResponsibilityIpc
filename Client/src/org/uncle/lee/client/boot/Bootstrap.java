package org.uncle.lee.client.boot;

import org.uncle.lee.handler.client.AlarmHandler;
import org.uncle.lee.handler.client.ClickAHandler;
import org.uncle.lee.handler.client.ClickBHandler;
import org.uncle.lee.handler.client.InitEngineHandler;
import org.uncle.lee.handler.engine.OnClickHandler;
import org.uncle.lee.handler.engine.OnInitDoneHandler;
import org.uncle.lee.handler.engine.OnPushHandler;
import org.uncle.lee.handler.engine.OnResultHandler;
import org.uncle.lee.ipc.IpcFactory;
import org.uncle.lee.ipc.pipeline.ClientPipeline;
import org.uncle.lee.ipc.pipeline.Pipeline;
import org.uncle.lee.ipc.pipeline.PipelineManager;

import android.content.Context;

public class Bootstrap {
	private PipelineManager pipelineManager;
	
	public void init(Context mContext){
		pipelineManager = IpcFactory.getInstance(mContext).createPipeLineManager();
		
		initClientPipeline(pipelineManager.clientPipeline());
		initEnginePipeline(pipelineManager.enginePipeline());
	}

	public PipelineManager pipelineManager(){
		return pipelineManager;
	}
	
	private void initEnginePipeline(Pipeline enginePipeline) {
		enginePipeline.add(new OnInitDoneHandler());
		enginePipeline.add(new OnClickHandler());
		enginePipeline.add(new OnResultHandler());
		enginePipeline.add(new OnPushHandler());
	}

	private void initClientPipeline(ClientPipeline clientPipeline) {
		clientPipeline.add(new InitEngineHandler());
		clientPipeline.add(new ClickAHandler());
		clientPipeline.add(new ClickBHandler());
		clientPipeline.add(new AlarmHandler());
	}
}
