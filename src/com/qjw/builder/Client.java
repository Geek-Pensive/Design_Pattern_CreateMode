package com.qjw.builder;

public class Client {
	
	public static void main(String[] args) {
		//1.new产生('乔江伟牌'飞船)零件builder
		AirShipBuilder builder = new QjwAirShipBuilder();
		//2.new组装('乔江伟牌'飞船)零件的director
		AirShipDirector director = new QjwAirShipDirector(builder);
		//3.进行组装
		AirShip airShip = director.directAirShip();
		
		//测试
		System.out.println(airShip);
		airShip.launch();
	}
	
}
