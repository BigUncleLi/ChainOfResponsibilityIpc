package org.uncle.lee.command.client;

import org.uncle.lee.common.preference.HandlerPereference;

public class AlarmCommand extends ClientCommand {

	@Override
	public String getAction() {
		return HandlerPereference.ACTION_CLIENT_ALARM;
	}

}
