package org.uncle.lee.ipc.pipeline;

import java.util.Iterator;
import java.util.Stack;

import org.uncle.lee.command.Command;
import org.uncle.lee.handler.ClientHandler;
import org.uncle.lee.handler.Handler;

public class ClientPipeline implements Pipeline {
	protected Stack<ClientHandler> handlerStack;
	
	public ClientPipeline(){
		handlerStack = new Stack<ClientHandler>();
	}

	public void request(Command command){
		Iterator<ClientHandler> iterator = handlerStack.iterator();
		while(iterator.hasNext()){
			ClientHandler next = iterator.next();
			if(needHandle(next, command)){
				break;
			}
		}
	}
	
	private boolean needHandle(ClientHandler next, Command command) {
		return next.action.equals(command.getAction()) && next.handle(command);
	}
	
	@Override
	public void add(Handler handler) {
		handlerStack.add((ClientHandler)handler);
	}
}
