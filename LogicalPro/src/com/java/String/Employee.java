package com.java.String;

public final class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ram", 24);
		emp1.setId(2);
		emp1.setName("shaym");
		emp1.setAge(27);
		System.out.println(emp1);
		Employee emp2 = new Employee(1, "ram", 24);
		System.out.println(emp2);
		System.out.println(emp1==emp2);
		
	}

}
