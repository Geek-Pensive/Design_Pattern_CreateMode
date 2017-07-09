package com.qjw.prototype;

import java.util.Date;

/**
 * 
 * 原型(克隆)模式
 * 	浅克隆:不拷贝属性，只是引用
 * 	深克隆:
 * 
 * @author q丶帮主
 *
 */
public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date = new Date(112141L);
		Sheep s1 = new Sheep("少利", date);
		Sheep s2 = (Sheep) s1.clone();//浅克隆
		System.out.println(s1.getBirthDay());
		System.out.println(s2.getBirthDay());
		//浅克隆 的两个对象 都引用date，date值发生改变，两个对象的引用值都发生改变
		date.setTime(1232423L);
		System.out.println(s1.getBirthDay());
		System.out.println(s2.getBirthDay());
		
		System.out.println("---------------");
		System.out.println(s1==s2);//false:指向不同引用，克隆的内容相同
		System.out.println(s1.equals(s2));//true:已重写equal()方法
	}
	
}
