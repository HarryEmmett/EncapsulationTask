package com.qa.community;

public class EncapsulationTaskExample {

	private String name;
	private int age;
	private double price;
	private float longnumber;
	private long passportid;
	
	public EncapsulationTaskExample(){}
	
	public EncapsulationTaskExample(String name, int age, double price, float longnumber, long passportid) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.longnumber = longnumber;
		this.passportid = passportid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getLongnumber() {
		return longnumber;
	}

	public void setLongnumber(float longnumber) {
		this.longnumber = longnumber;
	}

	public long getPassportid() {
		return passportid;
	}

	public void setPassportid(long passportid) {
		this.passportid = passportid;
	}

	@Override
	public String toString() {
		return "EncapsulationTaskExample [name=" + name + ", age=" + age + ", price=" + price + ", longnumber="
				+ longnumber + ", passportid=" + passportid + "]";
	}
	
}
