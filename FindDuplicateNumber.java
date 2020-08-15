package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 
1)Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6
 */
public class FindDuplicateNumber {

	public static void main(String[] args) {

		int[] a={1,2,5,5,6,6,7,2,10,10};
		System.out.print("Duplicate Value: ");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j] ) {
					System.out.print(a[i]+" ");
				}
				

			}
			
		}
		
	}

}
