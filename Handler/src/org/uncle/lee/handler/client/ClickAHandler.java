package org.uncle.lee.handler.client;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.ClientHandler;

public class ClickAHandler extends ClientHandler {
	
	public ClickAHandler(){
		action = HandlerPereference.ACTION_CLIENT_CLICK;
		priority = HandlerPereference.NORMAL_PRIORITY;
	}

	@Override
	public boolean handle(Command command) {
		
		return false;
	}


}
