package com.suresh;

import java.util.Arrays;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 3)Write a Java Program to find sum of unique elements in given Array?
 * Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
 * Output : 24 
 * (Unique elements are: 1, 6, 4, 3, 2, 8)
 * 
 * Input= {1, 1, 3, 2, 2, 3};
 * Output : 6
 * (Unique elements are: 1, 2, 3)
 */
public class SumOfUniqueNumber {
	public static void sumOfUnique(int[] arrNumbers)
	   {
		int current=arrNumbers[0];
		int sum=arrNumbers[0];
		for (int i = 1; i < arrNumbers.length; i++) {
			if(current!=arrNumbers[i]){
				sum+=arrNumbers[i];
				current=arrNumbers[i];
			}
		}
		
System.out.println("Sum of the unque Number : "+sum);			
		
       }
	public static void main(String[] args) {
		
		int[] arrInput = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		
	      // first sort array
	      Arrays.sort(arrInput); 
	    SumOfUniqueNumber.sumOfUnique(arrInput);
				
	}

}
