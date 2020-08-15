package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 5)Write a java program to find maximum difference between two elements in given Array?
Input = { 2, 5, 1, 7, 3, 9, 5}
Output = 8  

Explanation : The maximum difference is between 1 and 9

Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
Output: 17

Explanation : The maximum difference is between 19 and 2
 */
public class MaxDifference {
	 static void findGap(int [] a){
	        int maximum_diff = 0;
	        for (int i = 0; i <a.length ; i++) {
	            for (int j = 1; j <a.length ; j++) {
	                int x = a[i];
	                int y = a[j];
	                int diff = Math.abs(x-y);
	                if(maximum_diff<diff)
	                    maximum_diff = diff;
	            }
	        }
	        System.out.println("Largest Gap between any two elements is: " +  maximum_diff);
	    }
	public static void main(String[] args) {
		int [] a = { 2, 5, 1, 7, 3, 9, 5};
        findGap(a);
        int [] b = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
        findGap(b);

	}

}
