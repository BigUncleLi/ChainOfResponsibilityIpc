package org.uncle.lee.handler.client;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.engine.Engine;
import org.uncle.lee.handler.ClientHandler;

public class InitEngineHandler extends ClientHandler {

	public InitEngineHandler(){
		action = HandlerPereference.ACTION_CLIENT_INIT_ENGINE;
		priority = HandlerPereference.MAX_PRIORITY;
	}
	
	@Override
	public boolean handle(Command command, Engine engine) {
		return false;
	}

}
