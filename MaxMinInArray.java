package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 6)Write a Java Program to find Min and Max elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:   Min : 1  Max : 7
 */
public class MaxMinInArray {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 5, 5, 6, 6, 7, 2 };

		int min = a[0]; //  assume first elements as min number
		int max = a[0]; //  assume first elements as max number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Max Number in a given array is : " + max);
		System.out.println("Min Number in a given array is : " + min);
	}

}
