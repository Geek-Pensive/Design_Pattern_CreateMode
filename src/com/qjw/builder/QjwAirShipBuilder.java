package com.qjw.builder;

/**
 * 产生‘乔江伟’牌 飞船零件
 * 
 * 注意StringBuilder等 都是构建者模式
 */
public class QjwAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("构建乔江伟牌引擎");
		return new Engine("乔江伟牌引擎");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建乔江伟牌轨道舱");
		return new OrbitalModule("乔江伟牌轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建乔江伟牌逃逸塔");
		return new EscapeTower("乔江伟牌逃逸塔");
	}
	
}
