package com.qjw.singleton;


/*
 * 静态内部类 单例模式
 * 		线程安全
 * 		懒加载
 * 		调用效率高
 */
public class SingletonDemo4 {
	
	//私有化构造器
	private SingletonDemo4() {}
	
	//SingletonDemo4加载时，不会加载 内部类，当调用getInstance方法时，才加载，天然线程安全
	private static class innerClass{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance() {
		return SingletonDemo4.innerClass.instance;
	}
	  
	
	
	
	
}
