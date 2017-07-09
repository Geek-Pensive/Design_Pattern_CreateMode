package com.qjw.singleton;

/**
 * 饿汉式 单例模式：
 * 		线程安全
 * 		立即加载(非懒加载)
 * 		方法无需同步，调用效率高
 */
public class SingletonDemo1 {
	
	//static:类加载时，立即记载 这个对象，类加载是 天然线程安全的！
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {}
	
	//方法无需同步，调用效率高
	public static SingletonDemo1 getInstance() {
		return instance;
	}
	
}
