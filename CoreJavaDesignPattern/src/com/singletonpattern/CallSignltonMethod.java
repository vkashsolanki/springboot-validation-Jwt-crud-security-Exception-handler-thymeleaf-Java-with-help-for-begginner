package com.singletonpattern;

public class CallSignltonMethod {
	
	public static void main(String[] args) {
		
		
		SingletonPattern obj = SingletonPattern.getObj();
		SingletonPattern obj1 = SingletonPattern.getObj();
		SingletonPattern obj2 = SingletonPattern.getObj();
		SingletonPattern obj3 = SingletonPattern.getObj();
		SingletonPattern obj4 = SingletonPattern.getObj();
		SingletonPattern obj5 = SingletonPattern.getObj();
		SingletonPattern obj6 = SingletonPattern.getObj();
		SingletonPattern obj7 = SingletonPattern.getObj();
		SingletonPattern obj8 = SingletonPattern.getObj();
		SingletonPattern obj9 = SingletonPattern.getObj();
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		System.out.println(obj7);
		System.out.println(obj8);
		System.out.println(obj9);
		
		
		
	}
	

}
