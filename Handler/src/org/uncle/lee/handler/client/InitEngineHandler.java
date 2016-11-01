package org.uncle.lee.handler.client;

import org.uncle.lee.command.Command;
import org.uncle.lee.engine.Engine;
import org.uncle.lee.handler.ClientHandler;

public class InitEngineHandler extends ClientHandler {

	@Override
	public boolean handle(Command command, Engine engine) {
		return false;
	}

}
