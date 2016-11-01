package org.uncle.lee.engine.service.aidl;

import org.uncle.lee.engine.service.aidl.EngineServiceListener;

interface EngineServiceOperator {
	void setListener(EngineServiceListener listener);
	
	void initEngine();
	void doClick();
}
