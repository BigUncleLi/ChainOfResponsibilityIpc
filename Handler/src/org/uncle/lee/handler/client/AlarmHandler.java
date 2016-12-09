package org.uncle.lee.handler.client;

import org.uncle.lee.command.Command;
import org.uncle.lee.common.preference.HandlerPereference;
import org.uncle.lee.handler.ClientHandler;

public class AlarmHandler extends ClientHandler {
	
	public AlarmHandler(){
		action = HandlerPereference.ACTION_CLIENT_ALARM;
		priority = HandlerPereference.MAX_PRIORITY;		
	}

	@Override
	public boolean handle(Command command) {
		return false;
	}

}
