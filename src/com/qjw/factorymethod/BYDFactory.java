package com.qjw.factorymethod;

public class BYDFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Benz();
	}

}
