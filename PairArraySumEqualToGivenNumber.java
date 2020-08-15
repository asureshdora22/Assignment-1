package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 9)Write a Java program to find element Pairs in given Array whose sum is equal to given number

	Input Array :  {3, 6, 8, -8, 10, 8 } 
	Sum : 16
	Output :  Pairs with sum 16 are (6, 10) and (8, 8)
 */
public class PairArraySumEqualToGivenNumber {

	 static void findThePairs(int inputArray[], int inputNumber)
	    {
	        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
	 
	        for (int i = 0; i < inputArray.length; i++)
	        {
	            for (int j = i+1; j < inputArray.length; j++)
	            {
	                if(inputArray[i]+inputArray[j] == inputNumber)
	                {
	                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
	                }
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        findThePairs(new int[] {3, 6, 8, -8, 10, 8 } , 16);
	 
	        
	 
	        
	    }

}
