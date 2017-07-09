package com.qjw.singlfactory;

/**
 * 简单工厂：不满足开闭原则
 */
public class factory {
	
	public static Car createCar(String type) {
		
		switch (type) {
		case "BYD":
			return new BYD();
		case "BMW":
			return new BMW();
		default:
			return null;
		}
		
	}
	
}
