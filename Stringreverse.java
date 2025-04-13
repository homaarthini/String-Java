package com.myworkout.practice;

public class Stringreverse {
	public String reverseString(String name) {
		int length=name.length();
		StringBuilder sb=new StringBuilder();
		for(int i=length-1;i>=0;i--) {
			sb.append(name.charAt(i));
		}
		return sb.toString();
	}
}
