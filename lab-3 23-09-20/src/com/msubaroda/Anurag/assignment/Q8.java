// 8. Write a program to print the elements of an integer/float array after doubling.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q8 {
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

//        Doubling the array elements
        for (int i = 0; i < size; i++)
        {
            array[i] *= 2;
        }


//        printing array
        System.out.print("\nThe elements of array are: ");
        for (int element: array)
        {
            System.out.print(element+ " ");
        }


    }

}
