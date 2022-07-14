package com.dilip.basics;

import com.pattern.singleton.SingleClass;

public class TestThread extends Thread {
	public void run() {	
		SingleClass sobj = SingleClass.getSingleObj();
		String dbconn = sobj.getConn();
		System.out.println(dbconn);
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		TestThread t1 = new TestThread();
		t1.start();
		
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
		
		
		
	}

}
