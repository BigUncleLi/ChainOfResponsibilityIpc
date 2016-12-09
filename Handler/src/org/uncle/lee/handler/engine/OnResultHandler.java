package org.uncle.lee.handler.engine;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.EngineHandler;

public class OnResultHandler extends EngineHandler {
	
	public OnResultHandler(){
		action = HandlerPereference.ACTION_ENGINE_ON_RESULT;
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}

	@Override
	public boolean handle(Command command) {
		return false;
	}

}
