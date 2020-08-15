package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 2)Write a Java Program to remove duplicate elements in given Array?
 * Input:  1, 2, 5, 5, 6, 6, 7, 2
 * Output:  1, 2, 5, 6, 7
 */
public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int[] a={1, 2, 5, 5, 6, 6, 7, 2}; 
		int temp1;
		int len=a.length;
		 
		int temp[]=new  int[a.length];
		int l=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		
	//1 2 2 5 5 6 6 7
		for (int i = 0; i < len-1; i++) {
			
			if (a[i]!=a[i+1]) {
				temp[l++]=a[i];//12567
		
			}
				
		}
				
					
		temp[l++]=a[len-1];
		for (int i = 0; i < l; i++) {
			System.out.print(temp[i]);
		}
				
				
			}
		
		

	}


