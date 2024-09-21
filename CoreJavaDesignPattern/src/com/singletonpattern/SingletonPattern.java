package com.singletonpattern;

public final class SingletonPattern {

	

	static SingletonPattern obj = new SingletonPattern();
	
	private SingletonPattern() {
		
	}
	
	// synchroniuzed se multithreading environment me multi thread sequencelly acccess karen
	public synchronized static  SingletonPattern getObj() {
		
		
		return obj;
	}
	
}
