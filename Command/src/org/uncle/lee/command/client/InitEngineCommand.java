package org.uncle.lee.command.client;

import org.uncle.lee.common.preference.HandlerPereference;

public class InitEngineCommand extends ClientCommand {
	
	public InitEngineCommand(){
		
	}

	@Override
	public String getAction() {
		return HandlerPereference.ACTION_CLIENT_INIT_ENGINE;
	}

}
