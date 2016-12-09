package org.uncle.lee.command.engine;

import org.uncle.lee.common.preference.HandlerPereference;

public class OnClickCommand extends EngineCommand {

	@Override
	public String getAction() {
		return HandlerPereference.ACTION_SERVER_ON_CLICK;
	}

}
