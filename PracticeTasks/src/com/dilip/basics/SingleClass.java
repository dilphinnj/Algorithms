package com.dilip.basics;

public class SingleClass {

	private static SingleClass obj; // Early, instance will be created at load time

	private SingleClass() {
	}

	public static SingleClass getSingleObj() {
		synchronized (SingleClass.class) {
			if (obj == null) {
				obj = new SingleClass();// instance will be created at request time
			}
		}
		return obj;
	}

	public String getConn() {
		return "DB Conn";
	}

}
