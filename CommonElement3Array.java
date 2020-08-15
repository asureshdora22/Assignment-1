package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 8)Write a Java Program to find common elements among below 3 Arrays?

Input: 

ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}

Output: 20, 80
 */
public class CommonElement3Array {
	public void findCommon(int [] A, int [] B, int [] C){
		int i=0,j=0,k=0;
		while(i<A.length && j<B.length && k<C.length){
			if((A[i]==B[j])&& (B[j]==C[k])){
				System.out.print(A[i] + " ");
				i++;j++;k++;
			}else if((A[i]<=B[j])&& (A[i]<=C[k])){
				i++;
			}else if((B[j]<=A[i])&& (B[j]<=C[k])){
				j++;
			}else{
				k++;
			}
		}
	}
	public static void main(String[] args) {
		int [] A = {1, 5, 10, 20, 40, 80};
		int [] B = {6, 7, 20, 80, 100};
		int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
		CommonElement3Array c = new CommonElement3Array();
		System.out.print("Common Elements are : ");
		c.findCommon(A, B, C);
	}

}
