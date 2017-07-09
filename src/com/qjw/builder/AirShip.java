package com.qjw.builder;

/**
 * 宇宙飞船类
 */
public class AirShip {
	//轨道舱
	private OrbitalModule orbitalModule;
	//引擎
	private Engine engine;
	//逃逸塔
	private EscapeTower escapeTower;
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	@Override
	public String toString() {
		return "AirShip [orbitalModule=" + orbitalModule + ", engine=" + engine + ", escapeTower=" + escapeTower + "]";
	}
	public void  launch() {
		System.out.println("发射");
	}
	
}
//模拟飞船的组件
	class OrbitalModule{
		String name ;
		public OrbitalModule(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "OrbitalModule [name=" + name + "]";
		}
		
	}
	class Engine{
		String name ;
		public Engine(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Engine [name=" + name + "]";
		}
		
	}
	class EscapeTower{
		String name ;
		public EscapeTower(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "EscapeTower [name=" + name + "]";
		}
		
	}
