package com.myworkout.practice;

public class Countwords {
	public int countword(String sentence) {
		sentence=" hi this is homaarthini ";
		String[] words=sentence.trim().split("\\s+");
		int count=words.length;
		return count;
		
	}
	public static void main(String args[]) {
		String sentence1="hi this is test ";
		Countwords number=new Countwords();
		int result=number.countword(sentence1);
		System.out.println(result);
	}
}