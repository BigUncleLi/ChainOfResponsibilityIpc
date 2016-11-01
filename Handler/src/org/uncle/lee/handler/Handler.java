package org.uncle.lee.handler;

import org.uncle.lee.command.Command;

public interface Handler {
	public boolean handle(Command command);
}
