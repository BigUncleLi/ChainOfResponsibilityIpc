package org.uncle.lee.handler;

import org.uncle.lee.common.preference.HandlerPereference;

public abstract class EngineHandler implements Handler{
	protected String action;
	protected int priority;
	
	public EngineHandler(){
		priority = HandlerPereference.DEFAULT_PRIORITY;
	}

}
