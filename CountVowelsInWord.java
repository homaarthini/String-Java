package com.myworkout.practice;

public class CountVowelsInWord {
	public int vowelsCount(String name) {
		char[] split=name.toCharArray();
		char[] vowels={'a','e','i','o','u'};
		int vow=0;
		int con=0;
		for(int i=0;i<=split.length-1;i++) {
			int temp =0;
			for(int j=0;j<=vowels.length-1;j++) {
			if(split[i]==(vowels[j])) {
				temp++;
				break;
			}
			
		}
			if(temp == 0) 
				con++;
			 else 
			   vow++;
			
	}
		return vow;
	}
	public static void main(String args[]) {
		String name = "";
		String operation = "Palidrom / Reverse / upprcase / lpowercase/sorting";
		CountVowelsInWord result=new CountVowelsInWord();
	    int count=result.vowelsCount("homaarthini");
	    System.out.println(count);
	}
}
