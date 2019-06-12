package com.credit.qc.util;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.credit.qc.base.TestBase;

public class TestUtil extends TestBase {
	
	static String currentDir = System.getProperty("user.dir");
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public String randomString(int n) {
		String AlphaNumericString = "." + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}
	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();//2019-06-11
		//System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	}
	
}
