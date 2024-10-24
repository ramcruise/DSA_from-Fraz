package com.java.oops;

public class Test {
	public static Test getInstanceObj = null;
	private Test(){
		
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
	}
	
	public static Test getInstance() {
		if(getInstanceObj == null) {
			getInstanceObj = new Test();
		}
		return getInstanceObj;
	}
	
	public void show() {
		System.out.println("Its working");
	}

}
