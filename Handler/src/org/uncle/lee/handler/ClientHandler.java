package org.uncle.lee.handler;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.engine.Engine;

public abstract class ClientHandler implements Handler {
	public String action = null;
	public int priority = HandlerPereference.DEFAULT_PRIORITY;
	
	public abstract boolean handle(Command command, Engine engine);
	
	@Deprecated
	@Override
	public boolean handle(Command command) {
		return false;
	}
}
