package com.java.Java8Features.functionalInterface;

public class LamdaDeclaration {
	public static void main(String[] arg) {

		Webpage w1 = new Webpage() {

			@Override
			public void header(String value) {
				System.out.println("Hello " + value);
			}
		};
		
		//w1.header("Apple");
		
		//Webpage w2 = (name) -> { System.out.println("Hello " + name); };
		//w2.header("facebook");
		
		//Webpage w3 = (value) -> { System.out.println("hi..."+value);};
		//w3.header("Tomcruise");
		
		Webpage2 w4 = (name, age) -> { System.out.println("hi... "+name+"'s is "+age); };
		w4.header("Ram", 33);
	}

}
