package com.dilip.basics;

import com.pattern.singleton.SingleClass;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		SingleClass sobj = SingleClass.getSingleObj();
		String dbconn = sobj.getConn();
		System.out.println(dbconn);
		System.out.println("Running........!");
	}
	
	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
	}

}
