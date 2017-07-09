package com.qjw.factorymethod;

/**
 * 工厂方法：符合开闭原则，
 * 		缺点：添加产品需要添加很多类
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		Car bmw = new BMWFactory().createCar();
		bmw.run();
		
		Car byd = new BYDFactory().createCar();
		byd.run();
	}
	
	
}
