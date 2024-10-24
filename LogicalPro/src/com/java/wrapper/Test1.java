package com.java.wrapper;

public class Test1 {

	public static void main(String[] args) {
		//Integer i = new Integer("ten");
		Float f = new Float("10.8F"); 
		System.out.println(f);
		
		Integer i1 = Integer.valueOf("10");
		System.out.println(i1);
		
		//valueOf() to create Wrapper object of given String and primitive data
		Integer i2= Integer.valueOf("10");
		System.out.println(i2);
		
		Double d= Double.valueOf("23.90");
		System.out.println(d);
		
		Boolean b = Boolean.valueOf("true");
		System.out.println(b);
		
		Integer i3= Integer.valueOf(10);
		System.out.println(i3);
		
		Double d1= Double.valueOf(23.90);
		System.out.println(d1);
		
		Boolean b1 = Boolean.valueOf(true);
		System.out.println(b1);
		
		//xxxValue() method to convert wrapper object to String/primitive data
		Integer i4 = new Integer(10);
		int val = i4.intValue();
		System.out.println(val);
		
		Integer i5 = new Integer("10");
		String val1 = i5.toString();
		System.out.println(val1);
		
		Float f1 = new Float(10.78f);
		float floatValue= f1.floatValue();
		System.out.println(floatValue);
		
		//parseXxx() method to convert String to corresponding primitive data
		int val3 = Integer.parseInt("10");
		System.out.println(val3);
		
		//String d3 = new Double(13);
		double d4 = Double.parseDouble("13.90");
		System.out.println(d4);
		
		//toString() to convert primititve to String data.
		String strVal = Integer.toString(10);
		System.out.println(strVal);
	}

}
