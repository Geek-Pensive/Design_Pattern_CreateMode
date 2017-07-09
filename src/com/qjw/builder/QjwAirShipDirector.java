package com.qjw.builder;

/**
 * 组装‘乔江伟’牌的飞船零件
 */
public class QjwAirShipDirector implements AirShipDirector{
	
	private AirShipBuilder builder;
	
	public QjwAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		//1.产生‘乔江伟’牌飞船零件
		Engine engine = builder.builderEngine();
		EscapeTower escapeTower = builder.builderEscapeTower();
		OrbitalModule orbitalModule = builder.builderOrbitalModule();
		
		//2.进行组装
		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setEscapeTower(escapeTower);
		ship.setOrbitalModule(orbitalModule);
		
		//3.返回'乔江伟'牌飞船 
		return ship;
	}
	
	
	
}
