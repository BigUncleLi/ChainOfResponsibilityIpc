package org.uncle.lee.common.preference;

public class HandlerPereference {
	public static final String ACTION_CLIENT_INIT_ENGINE = "init_engine";
	public static final String ACTION_CLIENT_CLICK_A = "click_a";
	public static final String ACTION_CLIENT_CLICK_B = "click_b";
	public static final String ACTION_CLIENT_ALARM = "alarm";
	
	public static final String ACTION_SERVER_ON_CLICK = "on_click";
	public static final String ACTION_SERVER_ON_INIT_DONE = "on_init_done";
	public static final String ACTION_SERVER_ON_PUSH = "on_push";
	public static final String ACTION_SERVER_ON_RESULT = "on_result";
	
	public static final int MAX_PRIORITY = 3;
	public static final int NORMAL_PRIORITY = 2;
	public static final int MIN_PRIORITY = 1;
	public static final int DEFAULT_PRIORITY = NORMAL_PRIORITY;
}
