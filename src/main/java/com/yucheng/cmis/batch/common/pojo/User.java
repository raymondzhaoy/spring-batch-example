package com.yucheng.cmis.batch.common.pojo;

public class User {

	private String name;
	private int age;
	private double wage;
	
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
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		return "name="+this.name+", age="+this.age+" , wage="+this.wage;
	}
	
	
	
}
