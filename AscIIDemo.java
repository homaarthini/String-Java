package com.myworkout.practice;

public class AscIIDemo {

	public static void main(String[] args) {
		
		char[] charss= {'a', 'b', 'A', 'B'};
		
		for(char ascii : charss) {
			System.out.println((int) ascii);
		}
		
		for(int i=1;i<=122;i++) {
		System.out.println( i + "-> "+ (char)i);
		}
		
	}
}
