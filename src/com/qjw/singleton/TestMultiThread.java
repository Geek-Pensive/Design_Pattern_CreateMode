package com.qjw.singleton;
 
public class TestMultiThread {
		
	public static void main(String[] args) throws InterruptedException {
		//测试饿汉式 
		new Thread(()->System.out.println(SingletonDemo1.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo1.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo1.getInstance().hashCode()),"线程1").start();
		Thread.sleep(200);
		System.out.println("~~~~~~~~~~~~");
		
		//测试懒汉式 
		new Thread(()->System.out.println(SingletonDemo2.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo2.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo2.getInstance().hashCode()),"线程1").start();
		Thread.sleep(200);
		System.out.println("------------");
		
		//测试double check
		new Thread(()->System.out.println(SingletonDemo3.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo3.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo3.getInstance().hashCode()),"线程1").start();
		Thread.sleep(200);
		System.out.println("!!!!!!!!!!!!");
	
		//测试静态内部类
		new Thread(()->System.out.println(SingletonDemo4.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo4.getInstance().hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo4.getInstance().hashCode()),"线程1").start();
		Thread.sleep(200);
		System.out.println("//////////////");
		
		//测试静态内部类
		new Thread(()->System.out.println(SingletonDemo5.INSTANCE.hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo5.INSTANCE.hashCode()),"线程1").start();
		new Thread(()->System.out.println(SingletonDemo5.INSTANCE.hashCode()),"线程1").start();
		
	}
		
}	
