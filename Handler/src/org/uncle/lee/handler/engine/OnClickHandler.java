package org.uncle.lee.handler.engine;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.EngineHandler;

public class OnClickHandler extends EngineHandler {
	
	public OnClickHandler(){
		action = HandlerPereference.ACTION_ENGINE_ON_CLICK;
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}

	@Override
	public boolean handle(Command command) {
		// TODO Auto-generated method stub
		return false;
	}

}
