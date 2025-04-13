package com.myworkout.practice;

public class Anogram {
	public char[] checkAnogram(String name1) {
		
		char[] array1=name1.toCharArray();
		return array1;
		
		}
	
	public void bubbleSort(char[] array1) {
		for (int i = 0;i<array1.length-1;i++) {
			for(int j=0;j<array1.length-1;j++) {
				if(array1[j]>array1[j+1]) {
					char temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		
	}
	public void printArray(char[] array1) {
		for(char c:array1) {
			System.out.println(c+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String name1="care";
		String name2="race";
		Anogram isCheck=new Anogram();
		char[] arr1=isCheck.checkAnogram(name1);
		char[] arr2=isCheck.checkAnogram(name2);
		
		isCheck.bubbleSort(arr1);
		isCheck.bubbleSort(arr2);
		String str1=new String(arr1);
		String str2=new String(arr2);
		
		
		if(str1.equals(str2)) {
			System.out.println(name1+" and "+name2+" are anagrams");
		}
		else {
			System.out.println(name1+" and "+name2+" are not anagrams");
		}
			
	}
}


