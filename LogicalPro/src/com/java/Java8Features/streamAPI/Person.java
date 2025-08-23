package com.java.Java8Features.streamAPI;

import java.util.List;

public class Person {
	String name;
	List<String> color;
	
	
	public Person(String name, List<String> color) {
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", color=" + color + "]";
	}
	
	

}
