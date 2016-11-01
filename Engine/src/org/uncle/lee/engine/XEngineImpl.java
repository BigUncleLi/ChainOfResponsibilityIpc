package org.uncle.lee.engine;

import org.uncle.lee.engine.pure.RealEngine;
import org.uncle.lee.engine.pure.RealEngineListener;

public class XEngineImpl implements Engine, XEngine {
	
	public XEngineImpl() {
	}

	@Override
	public void init() {
		RealEngine realEngine = new RealEngine();
		realEngine.setListener(new RealEngineListener() {
			@Override
			public void onInitDone() {
				
			}
		});
		realEngine.init();
	}
	
	@Override
	public void doClickAction() {
		
	}
}
