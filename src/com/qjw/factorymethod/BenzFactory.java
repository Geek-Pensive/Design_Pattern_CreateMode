package com.qjw.factorymethod;

public class BenzFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new BYD();
	}

}
