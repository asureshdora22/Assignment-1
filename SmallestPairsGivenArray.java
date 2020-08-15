package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 10)Write a Java Program to find smallest pair sum in given Array?

Input: arr[] = {1, 7, 2, 9, 6}
Output: 3

The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3
 */
public class SmallestPairsGivenArray {

	
		
		static int smallest_pair(int[] a, int n) 
		{ 
		    int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE; 
		    for (int j = 0; j < n; j++)  
		    { 
		  
		        // If found new minimum 
		        if (a[j] < min) 
		        { 
		  
		            // Minimum now becomes second minimum 
		            secondMin = min; 
		  
		            // Update minimum 
		            min = a[j]; 
		        } 
		  
		        // If current element is > min and < secondMin 
		        else if ((a[j] < secondMin) && a[j] != min) 
		  
		            // Update secondMin 
		            secondMin = a[j]; 
		    } 
		  
		    // Return the sum of the minimum pair 
		    return (secondMin + min); 
		} 
		  
		
		public static void main(String[] args) 
		{ 
		    int[] arr = {1, 7, 2, 9, 6}; 
		    int n = arr.length; 
		  
		    System.out.println(smallest_pair(arr, n)); 
		}

}

