package com.java.Java8Features;

public class implSayable2 {

	public static void main(String[] args) {
		Sayable2 s2 = (name1)->{return "hi...."+name1;};
		String val = s2.say("Ram");
		System.out.println(val);
	}

}
