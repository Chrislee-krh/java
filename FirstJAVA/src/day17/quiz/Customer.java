package day17.quiz;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = -4950876182077650107L;
	private String name;
	private int age;
	
	public Customer() {};
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return Integer.toString(age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
