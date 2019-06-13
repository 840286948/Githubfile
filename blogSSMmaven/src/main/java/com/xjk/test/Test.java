package com.xjk.test;

import java.net.InetAddress;

public class Test {
	public static void main(String[] args) {
		try {
			String address = InetAddress.getLocalHost().getHostAddress().toString();
			System.out.println(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
