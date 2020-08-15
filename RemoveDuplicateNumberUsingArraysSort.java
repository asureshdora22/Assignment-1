package com.suresh;
/*
 * A SURESH KUMAR DORA
 */

import java.util.Arrays;

public class RemoveDuplicateNumberUsingArraysSort {
	public static int removeDuplicate(int[] arrNumbers, int num)
	   {  
		/*
		 * it will check array lenght is 0 or 1
		 * then it return same value
		 */
	      if(num == 0 || num == 1)
	      {  
	         return num;  
	      }  
	      
	      int[] temp = new int[num];  
	      int b = 0;  
	      for(int a = 0; a < num - 1; a++)
	      {  
	         if(arrNumbers[a] != arrNumbers[a + 1])
	         {  
	            temp[b++] = arrNumbers[a];  
	         }  
	      }  
	      temp[b++] = arrNumbers[num - 1];
	      for(int a = 0; a < b; a++)
	      {  
	         arrNumbers[a] = temp[a];  
	      }  
	      return b;  
	   }
	public static void main(String[] args) {
		int[] arrInput = {2, 12, 10, 6, 8, 8, 2, 14, 12 ,4};
	      // first sort array
	      Arrays.sort(arrInput);  
	      int len = arrInput.length;  
	      len = removeDuplicate(arrInput, len);
	      for(int a = 0; a < len; a++)
	      {
	         System.out.print(arrInput[a] + " "); 
	      }

	}

}
