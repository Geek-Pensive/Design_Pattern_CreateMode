package com.qjw.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;


/**
 * 测试 懒汉式单例模式的漏洞，
 * 		反射和反序列化
 * 
 * 解决办法：在私有构造器抛出异常
 * 		     添加readResolve方法，反序列化时会自动调用该方法
 */
public class TestSingletonBug implements Serializable{
	
	private static final long serialVersionUID = 123124L;
	
	//不初始化
	private static TestSingletonBug instance ;
	
	private TestSingletonBug(){
		//解决反射创建类的漏洞
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	//解决反序列化漏洞,反序列化时，直接返回单例对象。 注意：方法名必须为readResolve
	private Object readResolve() {
		return instance;
	}
	
	//同步方法，懒加载。调用效率低
	public static synchronized TestSingletonBug getInstance() {
		if (instance == null) {
			instance = new TestSingletonBug();
		}
		return instance;
	}
	
	
	
	/*
	//测试反射创建对象 漏洞
	public static void main(String[] args) throws Exception {
		
		TestSingletonBug instance1 = TestSingletonBug.getInstance();
//		TestSingletonBug instance2 = TestSingletonBug.getInstance();
//		System.out.println(instance1 == instance2);
//		System.out.println(instance1.equals(instance2));
		
		Class<TestSingletonBug> class1 = (Class<TestSingletonBug>) Class.forName("com.qjw.singleton.TestSingletonBug");
		Constructor<TestSingletonBug> c = class1.getDeclaredConstructor(null);
		
		//跳过权限检查,设置成可以访问的
		c.setAccessible(true);
		
		//有权限，不可访问私有构造器，必须跳过权限
		TestSingletonBug instance3 = c.newInstance();
		
		//也可以直接new：不通过构造器
//		instance3 = class1.newInstance();
		
		System.out.println(instance1 == instance3);
		System.out.println(instance1.equals(instance3));
		System.out.println(class1.getName());
	}
	*/
	
	//通过反序列化创建对象漏洞
	public static void main(String[] args) throws Exception {
		//序列化
		TestSingletonBug instance = getInstance();//注意：不需要通过类调用，直接调用方法
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
		oos.writeObject(instance);
		
		oos.close();
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		TestSingletonBug instance2 = (TestSingletonBug)ois.readObject();
		System.out.println(instance == instance2);
		System.out.println(instance.equals(instance2));
		
	}
	
}
