package com.suresh;
/*
 * A SURESH KUMAR DORA
 */
/*
 * 7)Write Java Program to find second Min and Second Max elements in given Array ?

Input: 1, 2, 5, 9, 6, 4, 7, 2
Output: Second Min-2  Second Max-7
 */
public class SecondMaxMin {

	public static void main(String[] args) {


        int arr[] = {1, 2, 5, 9, 6, 4, 7, 2 };
        int max = arr[0];
        int secondmax = arr[0];
        int min = arr[0];
        int secondmin = arr[0];

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++)
        {
                System.out.print(arr[i]+" ");
        }
        System.out.println("\n=============================" );
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] > max)
                {
                        secondmax = max;
                        max = arr[i];
                }
                else if (arr[i] > secondmax)
                {
                        secondmax = arr[i];
                }
        }
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] < min)
                {
                        secondmin = min;
                        min = arr[i];
                }
                else if (arr[i] < secondmin)
                {
                        secondmin = arr[i];
                }
        }
        System.out.println("\nSecond maximum number is: " + secondmax);
        System.out.println("\nSecond minimum number is: " + secondmin);
	}

}
