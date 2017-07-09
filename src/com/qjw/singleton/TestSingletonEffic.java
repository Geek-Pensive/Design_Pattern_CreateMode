package com.qjw.singleton;

import java.util.concurrent.CountDownLatch;

/**
 *  测试效率
 */
public class TestSingletonEffic {
	
	public static void main(String[] args) throws Exception {
		
		int count = 10;
		final CountDownLatch cdl = new CountDownLatch(count);
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < count; i++){
			new Thread( () -> {
				for(int j = 0; j< 100000 ;j++ ){
					Object object = SingletonDemo1.getInstance();
				}
				cdl.countDown();
			},"线程"+i).start();
		}
		
		cdl.await();//main线程阻塞，知道计算器cdl变为0
		long end = System.currentTimeMillis();
		
		/**
		 * 1.饿汉 : 66 
		 * 2.懒汉 : 102  !!!
		 * 3.double check : 80
		 * 4.静态内部类 : 66
		 * 5.枚举  : 55
		 * 
		 *     不需延时加载：枚举 > 饿汉
		 *     需要延时加载：静态内部类  > 懒汉
		 */
		System.out.println(end-start);
		
	}
	
	
}
