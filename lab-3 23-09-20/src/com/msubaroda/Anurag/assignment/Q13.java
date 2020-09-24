// 13. Write a program to copy all elements of one array into another array.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Taking array size input from user
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of array: ");

//        Taking array element input from use
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter the element of "+ i + " index: ");
            array[i] = sc.nextInt();
        }

//        code for copying array
        int array_copy[] = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            array_copy[i] = array[i];
        }
        System.out.print("\nThe copied array elements are: ");
        for (int element: array_copy)
        {
            System.out.print(element +" ");
        }



    }

}
