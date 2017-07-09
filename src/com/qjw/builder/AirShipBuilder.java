package com.qjw.builder;

/*
 * 飞船零件产生接口
 */
public interface AirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower builderEscapeTower();
}
