package com.ce.model;

public abstract class Person {
	private String name;
	private int age;
	
	public Person() {
		/* no implementation */
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
}
