package org.uncle.lee.command.engine;

import org.uncle.lee.common.preference.HandlerPereference;

public class OnInitDoneCommand extends EngineCommand{

	@Override
	public String getAction() {
		return HandlerPereference.ACTION_ENGINE_ON_INIT_DONE;
	}

}
