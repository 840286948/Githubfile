package com.xjk.util;

import java.security.MessageDigest;

public class Encryption {
		//这里主要是遍历8个byte，转化为16位进制的字符，即0-F
		private static String byteArrayToHexString(byte b[]){
			StringBuffer resultSb = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				resultSb.append(byteToHexString(b[i]));
			}
			return resultSb.toString();
		}
		//这里是针对单个byte，256的byte通过16拆分为d1和d2
		private static String byteToHexString(byte b){
			int n = b;
			if(n < 0){
				n += 256;
			}
			int d1 = n / 16;
			int d2 = n % 16;
			return hexDigits[d1]+hexDigits[d2];
		}
		
		public static String MD5Encode(String charsetname){
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				
	            charsetname = byteArrayToHexString(md.digest(charsetname.getBytes()));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("-------------");
			}
			//toUpperCase()转成大写
			return charsetname.toUpperCase();
		}
		
	/*	 public static String MD5EncodeUtf8(String origin) {
		       origin = origin + PropertiesUtil.getProperty("password.salt", "");
		       return MD5Encode(origin, "utf-8");
		   }*/
		
		private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
	        "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
}
