package com.java.String;

public final class Immutable{
	private int i;
	
	Immutable(int i){
		this.i=i;
	}
	
	public Immutable modify(int i) {
		if(this.i==i) 
			return this;
		else
			return (new Immutable(i));
	}
	
	public static void main(String[] args) {
		Immutable c1 = new Immutable(10);
		Immutable c2 = c1.modify(100);
		Immutable c3 = c1.modify(10);
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		
	}

}
