package com.qjw.singlfactory;

public class factory2 {
	
	public static Car createBMW() {
		return new BMW();
	}
	
	public static Car createBYD() {
		return new BYD();
	}
	
}
