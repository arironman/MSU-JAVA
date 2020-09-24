// 16. Write a program to print the elements of an array in reverse order.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q16 {
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

//        printing array in reverse order
        System.out.print("\nThe elements of the array are: ");
        for (int i = array.length; i > 0; i--)
        {
            System.out.print(array[i-1] + " ");
        }

    }

}
