package com.suresh;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arrNumbers={1,2,3,3,5,4,4,2,6,6,8};
       int num=arrNumbers.length;
		
		/* if(num == 0 || num == 1)
	      {  
	         return;  
	      }*/  
	      int[] arrTemporary = new int[num];  
	      int b = 0;  
	      for(int a = 0; a < num - 1; a++)
	      {  
	         if(arrNumbers[a] != arrNumbers[a + 1])
	         {  
	            arrTemporary[b++] = arrNumbers[a];  
	         }  
	      }  
	      arrTemporary[b++] = arrNumbers[num - 1]; 
	      for(int a = 0; a < b; a++)
	      {  System.out.print(arrTemporary[a]+" ");
	         arrNumbers[a] = arrTemporary[a];  
	      }  
	}

}
