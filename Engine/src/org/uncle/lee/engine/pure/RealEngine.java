package org.uncle.lee.engine.pure;

public class RealEngine {
	private RealEngineListener listener;
	
	public RealEngine(){
		init();
	}
	
	private void init() {
		// do some blocking things
		// ...
		listener.onInitDone();
	}

	public void setListener(RealEngineListener listener){
		this.listener = listener;
	}
}
