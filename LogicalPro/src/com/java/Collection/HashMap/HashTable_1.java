package com.java.Collection.HashMap;

import java.util.Hashtable;

public class HashTable_1 {

	public static void main(String[] args) {
		Hashtable<String,Integer> hashTable = new Hashtable<String,Integer>();
		hashTable.put("Tom",100);
		hashTable.put("Naveen",200);
		hashTable.put("Ram",300);
		hashTable.put("Raja",400);
		
		System.out.println(hashTable);
	}

}
