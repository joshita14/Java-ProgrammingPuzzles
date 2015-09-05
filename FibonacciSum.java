package com.interview.prep.programmingpuzzles;

public class FibonacciSum {
	/**
	 *  next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
	 *  print fibonacci series
	 */
	
	void fibonacci(int number){
		
		int prev=0;int next=1;int num=0;
		for(int n=0;n<number;n++){
			//prev = n;
			num = prev+next;
			prev = next ;
			next = num;
			
			System.out.println("this is sum :"+num);
		}
	}
	
	public static void main(String[] args) {
		
		FibonacciSum f = new FibonacciSum();
		f.fibonacci(10);
	}

}
