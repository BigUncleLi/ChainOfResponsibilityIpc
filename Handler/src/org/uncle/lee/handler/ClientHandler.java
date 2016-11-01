package org.uncle.lee.handler;

import org.uncle.lee.command.Command;
import org.uncle.lee.engine.Engine;

public abstract class ClientHandler implements Handler {
	
	public abstract boolean handle(Command command, Engine engine);
	
	@Deprecated
	@Override
	public boolean handle(Command command) {
		return false;
	}
}
