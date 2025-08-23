package com.java.oops;

public class Static_Polymorphism_Test {

	public static void main(String[] args) {
		Static_Polymorphism_Test spt = new Static_Polymorphism_Test();
		Animal animal = new Animal();
		spt.methodOne(animal);
		
		Monkey monkey = new Monkey();
		spt.methodOne(monkey);
		
		Animal a1 = new Monkey();
		spt.methodOne(a1);
		
	}
	
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}
	
	public void methodOne(Monkey a) {
		System.out.println("Monkey version");
	}

}
