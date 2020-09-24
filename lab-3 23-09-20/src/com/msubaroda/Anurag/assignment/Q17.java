// 17. Write a program to print the elements of an array present on even position.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q17 {
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

//        printing elements of even position(even index number)
        System.out.print("\nThe elements of the array at even index are: ");
        for (int i = 0; i < array.length; i+=2)
        {
            System.out.print(array[i] + " ");
        }


    }

}
