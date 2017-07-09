package com.qjw.singleton;

/**
 * 懒汉式 单例模式：
 *		懒加载
 *		资源利用率高
 *		并发时效率低
 */
public class SingletonDemo2 {
	
	//不初始化
	private static SingletonDemo2 instance ;
	
	private SingletonDemo2(){}
	
	//同步方法，懒加载。调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
	
}
