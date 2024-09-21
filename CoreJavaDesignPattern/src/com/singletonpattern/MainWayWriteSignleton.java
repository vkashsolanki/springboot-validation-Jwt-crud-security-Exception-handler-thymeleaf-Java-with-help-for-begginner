package com.singletonpattern;

public final  class MainWayWriteSignleton {
	
	static MainWayWriteSignleton ms = null;
	
	private MainWayWriteSignleton() {
		
	}
	
    public synchronized static  MainWayWriteSignleton getObj() {
	
    	
    	if(ms == null) {
    	ms= new MainWayWriteSignleton();	
    		
    	}
    	
		
		return ms;
	}
	
	

}
