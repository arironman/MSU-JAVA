// 18. Write a program to print the elements of an array present on odd position.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q18 {
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

//        printing elements of odd position(odd index number)
        System.out.print("\nThe elements of the array at odd indexs are: ");
        for (int i = 1; i < array.length; i+=2)
        {
            System.out.print(array[i] + " ");
        }




    }

}
