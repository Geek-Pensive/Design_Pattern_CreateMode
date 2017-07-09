package com.qjw.singleton;

/**
 * 枚举实现单例模式 	
 * 		枚举类的对象本身就是单例的
 * 		避免通过反射和反序列化获取对象的漏洞
 * 		注：其他模式可通过反射和反序列化获得对象
 * 
 * 缺点：没有延时加载
 */
public enum SingletonDemo5 {
	
	//该类的单例对象，本身就是单例的
	INSTANCE;
	
	//其他方法，可添加自己需要的操作
	public void  singletonOpera() {
		
	}
	
	
}
