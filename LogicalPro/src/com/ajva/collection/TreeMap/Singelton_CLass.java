package com.ajva.collection.TreeMap;

public class Singelton_CLass implements Cloneable{
	private static Singelton_CLass instanceVal = null;
	
	private Singelton_CLass() {
		
	}
	
	public static synchronized Singelton_CLass getInstanceSS() {
		if(instanceVal == null) {
			instanceVal = new Singelton_CLass();
		}
		return instanceVal;
	}
	
	

}
