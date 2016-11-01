package org.uncle.lee.ipc.pipeline;

import java.util.Iterator;
import java.util.Stack;

import org.uncle.lee.command.Command;
import org.uncle.lee.engine.Engine;
import org.uncle.lee.handler.ClientHandler;
import org.uncle.lee.handler.Handler;

public class ClientPipeline implements Pipeline {
	protected Stack<ClientHandler> handlerStack = new Stack<ClientHandler>();
	private Engine engine;
	
	public ClientPipeline(Engine engine){
		this.engine = engine;
	}

	public void request(Command command){
		Iterator<ClientHandler> iterator = handlerStack.iterator();
		while(iterator.hasNext()){
			ClientHandler next = iterator.next();
			if(needHandle(next, command) && next.handle(command, engine)){
				break;
			}
		}
	}
	
	private boolean needHandle(Handler next, Command command) {
		return false;
	}
	
	@Override
	public void add(Handler handler) {
		
	}

}
