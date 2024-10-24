package com.java.Collection.Set;

import java.util.EnumSet;

public class EnumSetConcepts {
	enum Lang{
		Java,Python,Go_Lang,Ruby;
	}
	public static void main(String[] args) {
		
		//Created a new EnumSet using enum
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//empty enum set:
		 EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		 System.out.println(l);
		 
		 //range(e1,e2)
		  EnumSet<Lang> l2 = EnumSet.range(Lang.Java, Lang.Go_Lang);
		  System.out.println(l2);
		  
		  //of:
		  EnumSet<Lang> l3 = EnumSet.of(Lang.Python);
		  System.out.println(l3);
	}

}
