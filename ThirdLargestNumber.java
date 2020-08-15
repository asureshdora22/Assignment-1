package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 4)Write a Java program to find third largest number in given Array ?

Input = { 6, 8, 1, 9, 2, 1, 10}
Output: Third largest element : 8

Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
Output: Third largest element : 9

Int [] a = {6}
Output: Invalid Input, array size is less than 3
 */
import java.util.Arrays;

public class ThirdLargestNumber {
	public static void thirdLargestNum(int[] arrInput) {

		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for (int i = 0; i < arrInput.length; i++) {
			int current=arrInput[i];
			if(first<current){
				third=second;
				second=first;
				first=current;
			}
			else if(second<current){
				third=second;
				second=current;
			}
			else if(third<current){
				third=current;
				
			}
		}
		System.out.println(third);
	}
	public static void main(String[] args) {
		int[] arrInput = { 6, 8, 1, 9, 2, 1, 10};
		
		ThirdLargestNumber.thirdLargestNum(arrInput);

	}

	

}
