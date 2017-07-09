package com.qjw.singleton;

/**
 *  double check lock:
 *  	多线程安全
 */
public class SingletonDemo3 {
	
	private volatile static SingletonDemo3 instance;
	
	private SingletonDemo3(){}
	
	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			synchronized (SingletonDemo3.class) {
				if (instance == null) {
					instance = new SingletonDemo3();
				}
			}
		}
		return instance;
	}
	
	
}
