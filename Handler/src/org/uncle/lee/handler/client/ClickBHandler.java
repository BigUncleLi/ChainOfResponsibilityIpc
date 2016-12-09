package org.uncle.lee.handler.client;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.ClientHandler;

public class ClickBHandler extends ClientHandler {
	
	public ClickBHandler(){
		action = HandlerPereference.ACTION_CLIENT_CLICK_B;
		priority = HandlerPereference.DEFAULT_PRIORITY;		
	}

	@Override
	public boolean handle(Command command) {
		return false;
	}

}
