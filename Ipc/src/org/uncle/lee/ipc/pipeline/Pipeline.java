package org.uncle.lee.ipc.pipeline;

import java.util.Iterator;
import java.util.Stack;

import org.uncle.lee.command.Command;
import org.uncle.lee.handler.Handler;

public abstract class Pipeline {
	protected Stack<Handler> handlerStack = new Stack<Handler>();
	
	public abstract void add(Handler handler);
	
	public void request(Command command){
		Iterator<Handler> iterator = handlerStack.iterator();
		while(iterator.hasNext()){
			Handler next = iterator.next();
			if(needHandle(next) && next.handle(command)){
				break;
			}
		}
	}

	private boolean needHandle(Handler next) {
		return false;
	}
}
