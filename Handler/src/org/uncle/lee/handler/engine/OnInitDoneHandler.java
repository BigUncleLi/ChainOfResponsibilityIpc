package org.uncle.lee.handler.engine;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.EngineHandler;

public class OnInitDoneHandler extends EngineHandler {
	
	public OnInitDoneHandler(){
		action = HandlerPereference.ACTION_ENGINE_ON_INIT_DONE;
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}

	@Override
	public boolean handle(Command command) {
		return false;
	}

}
