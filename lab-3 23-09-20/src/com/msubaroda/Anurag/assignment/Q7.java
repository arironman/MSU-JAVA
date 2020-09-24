// 7. Write a program to iterate over the array and print its elements. (Use for each loop)
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q7 {
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

//        printing array
        System.out.print("\nThe elements of array are: ");
        for (int element: array)
        {
            System.out.print(element+ " ");
        }



    }

}
