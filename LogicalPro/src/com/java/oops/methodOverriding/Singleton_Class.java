package com.java.oops.methodOverriding;

import java.io.Serializable;

public class Singleton_Class implements Cloneable, Serializable {
	private static final long serialVersionUID = -5664124213376258176L;

	private static Singleton_Class singletonClassInstance = null;

	private Singleton_Class() {

	}

	public static Singleton_Class getInstance() {
		if (singletonClassInstance == null) {
			synchronized (Singleton_Class.class) {
				singletonClassInstance = new Singleton_Class();
			}

		}
		return singletonClassInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singletonClassInstance;
	}

	protected Object readResolve() {
		return singletonClassInstance;
	}

}
