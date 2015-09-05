package com.interview.prep.programmingpuzzles;

public class ConvertIntegerToString {
	
/**
 *  Convert String = "98989" into an integer without using any library functions in java.
	Give fastest way to do it and explain why your method is best.
	0	48	00110000
	1	49	00110001
	2	50	00110010
	3	51	00110011
	4	52	00110100
	5	53	00110101
	6	54	00110110
	7	55	00110111
	8	56	00111000
	9	57	00111001
	
	
	Important : for cases like these , when we want each an individual string to be compared just convert the string to char array
 */
	
	private int convertStringToInteger(){
		
		int result = 0;
		int asciiValueOfZero = 48;
		int asciiValueOfNine = 57;
		
		//String input ="98989";
		String input ="34256";
		char [] array = input.toCharArray();//now from this we get an array each no at an index
		
		// here && is : if left side of the operand is true then the right side of the operand is evaluated
		for(char c : array){
			//logic any number would lie b/w zero and nine: obvious
			if(c >=asciiValueOfZero && c<=asciiValueOfNine){
				
				if(c == asciiValueOfNine){
					System.out.println("is equal");
				}
				//very clever : number minus the asciiValueOfZero is always the number itself (here c is converted to ascii value), such cool stuff
				//http://stackoverflow.com/questions/8232826/why-doesnt-my-compare-work-between-char-and-int-in-java
				result = result*10+(c-asciiValueOfZero);
			}
			else{
				return -1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		ConvertIntegerToString c = new ConvertIntegerToString();
		int number = c.convertStringToInteger();
		System.out.println(number);
	}

}
