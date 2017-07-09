package com.qjw.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 使用序列化与反序列化实现  深克隆(原型)模式
 * 
 * @author q丶帮主
 *
 */
public class TestSerial {
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		//使用sheep，po内没有实现深克隆
		Date date = new Date(112141L);
		Sheep s1 = new Sheep("少利", date);
		System.out.println(s1.getBirthDay());
		
		//将s1对象序列化到一个字节数组中bytes
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		//利用反序列化 克隆一只s2:深克隆
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ios = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ios.readObject();
		
		date.setTime(21343543L);
		System.out.println(s1.getBirthDay());
		System.out.println(s2.getBirthDay());
		
	}
	
}
