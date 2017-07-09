package com.qjw.prototype;

/**
 * 克隆模式用于new一个对象，过程很复杂，而且比较耗时
 * 		测试效率：
 * 
 * @author q丶帮主
 *
 */
public class TestEffic {
	
	public static void testNew(int num) {
		long start = System.currentTimeMillis();
		
		for(int i = 0;i < num;i++){
			Laptop l = new Laptop();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("new方式耗时:"+(end-start));
	}
	public static void testClone(int num) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		
		Laptop l = new Laptop();
		for(int i = 0;i < num;i++){
			Laptop tmp = (Laptop) l.clone();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("clone方式耗时:"+(end-start));
	}
	
	//测试
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);
		testClone(1000);
		
	}
}

/*
 * 笔记本类
 */
class Laptop implements Cloneable{
	//模拟new过程的耗时
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
