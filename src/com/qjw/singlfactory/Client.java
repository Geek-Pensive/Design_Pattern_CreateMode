package com.qjw.singlfactory;

/**
 *  简单工厂：不符合开闭原则，添加产品需要修改工厂的方法的代码
 */
public class Client {
	
	public static void main(String[] args) {
		
		Car car = new BYD();
		car.run();
		
		Car car2 = factory.createCar("BMW");
		car2.run();
		
	}
}
