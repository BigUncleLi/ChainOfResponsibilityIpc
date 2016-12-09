package org.uncle.lee.handler;

import org.uncle.lee.common.preference.HandlerPereference;

public abstract class ClientHandler implements Handler {
	public String action;
	public int priority;

	public ClientHandler(){
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}
}
