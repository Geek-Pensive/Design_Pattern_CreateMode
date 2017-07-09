package com.qjw.prototype;

import java.util.Date;

/**
 * 
 * 原型(克隆)模式
 * 	浅克隆:
 * 	深克隆:完全拷贝属性，(两套一模一样)
 * 
 * @author q丶帮主
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(112141L);
		Sheep2 s1 = new Sheep2("多利", date);
		//深克隆
		Sheep2 s2 = (Sheep2) s1.clone();
		
		System.out.println(s1.getBirthDay());
		System.out.println(s2.getBirthDay());
		//深克隆 的两个对象 都引用date，date值发生改变，互相不影响
		date.setTime(1232423L);
		System.out.println(s1.getBirthDay());//date的改变只是影响了原来的羊
		System.out.println(s2.getBirthDay());
	}
}
