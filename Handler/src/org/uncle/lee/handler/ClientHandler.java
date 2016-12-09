package org.uncle.lee.handler;

import org.uncle.lee.common.preference.HandlerPereference;

public abstract class ClientHandler implements Handler {
	protected String action;
	protected int priority;

	public ClientHandler(){
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}
}
