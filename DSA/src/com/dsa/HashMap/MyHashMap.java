package com.dsa.HashMap;

import java.util.LinkedList;

public class MyHashMap {
	LinkedList<Entry>[] map;
	public static int size = 769;
	
	public static void main(String[] args) {
		
	}

	public MyHashMap() {
		map = new LinkedList[size];
	}

	public void put(int key, int value) {
		int bucket = key%size;
		if(map[bucket] == null) {
			map[bucket] = new LinkedList<Entry>();
			map[bucket].add(new Entry(key,value));
		}else {
			for(Entry entry : map[bucket]) {
				if(entry.key == key) {
					entry.value = value;
					return;
				}
			}
			map[bucket].add(new Entry(key,value));
		}
	}

	public int get(int key) {
		int bucket = key % size ;
		LinkedList<Entry> entry = map[bucket];
		if(entry == null)
			return -1;
		for(Entry entries : entry) {
			if(entries.key == key) {
				return entries.value;
			}
		}
		return -1;

	}

	public void remove(int key) {
		int bucket = key%size;
		Entry toRevome = null;
		if(map[bucket] == null)
			return;
		for(Entry entry : map[bucket]) {
			if(entry.key == key) {
				toRevome = entry;
			}
		}
		if(toRevome == null)
			return;
		map[bucket].remove(toRevome);
	}
}

class Entry{
	public int key;
	public int value;
	public Entry(int key, int value){
		this.key = key;
		this.value = value;
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */
