package org.uncle.lee.ipc.pipeline;

import java.util.Iterator;
import java.util.Stack;

import org.uncle.lee.command.Command;
import org.uncle.lee.engine.Engine;
import org.uncle.lee.handler.ClientHandler;
import org.uncle.lee.handler.Handler;

public class ClientPipeline implements Pipeline {
	protected Stack<ClientHandler> handlerStack;
	private Engine engine;
	
	public ClientPipeline(Engine engine){
		handlerStack = new Stack<ClientHandler>();
		this.engine = engine;
	}

	public void request(Command command){
		Iterator<ClientHandler> iterator = handlerStack.iterator();
		while(iterator.hasNext()){
			ClientHandler next = iterator.next();
			boolean isCommandHandled = needHandle(next, command) && next.handle(command, engine);
			if(isCommandHandled){
				break;
			}
		}
	}
	
	private boolean needHandle(ClientHandler next, Command command) {
		return next.action.equals(command.getAction());
	}
	
	@Override
	public void add(Handler handler) {
		handlerStack.add((ClientHandler)handler);
	}
}
