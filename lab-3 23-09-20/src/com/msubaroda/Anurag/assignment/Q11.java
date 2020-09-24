// 11. Write a method which takes an array as a parameter and returns the sum of all of its elements.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q11 {

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

//        Creating objects of Q11 class to use the sum method.
        Q11 arr = new Q11();
        System.out.println("\nThe sum of the elements of the array is: " + arr.sum(array));

    }

//    The sum method which take array as input and return the sum of its elements
    public int sum(int [] array){
        int total = 0;
        for (int element: array)
        {
            total += element;
        }
        return total;
    }


}
