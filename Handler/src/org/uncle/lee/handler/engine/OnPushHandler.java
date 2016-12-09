package org.uncle.lee.handler.engine;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.EngineHandler;

public class OnPushHandler extends EngineHandler {

	public OnPushHandler(){
		action = HandlerPereference.ACTION_SERVER_ON_PUSH;
		priority = HandlerPereference.MAX_PRIORITY;
	}
	
	@Override
	public boolean handle(Command command) {
		// TODO Auto-generated method stub
		return false;
	}

}
