package org.uncle.lee.engine.service.aidl;

interface EngineServiceListener {
	void onInitDone();
	void onClick();
	void onResult();
	
	void onPush();
}
