package com.interview.prep.programmingpuzzles;

public class ReverseAString {

	
	/**
	 * The input String "abcde" should return "edcba".
	 */
	
	void reverseAString(String string){
		
		int lengthOfString = string.length();
		char [] chararray= string.toCharArray();
		
		int i=0; int j= chararray.length-1;
		
		while(i<j){
			
			char t = chararray[i];
			chararray[i] = chararray[j];
			chararray[j] = t;
			i++;j--;
		}
		
		for(char s : chararray){
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		ReverseAString  r = new ReverseAString();
		r.reverseAString("abc");
	}
}
