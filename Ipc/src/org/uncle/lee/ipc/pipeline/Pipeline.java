package org.uncle.lee.ipc.pipeline;

import org.uncle.lee.handler.Handler;

public interface Pipeline {
	public void add(Handler handler);
}
