// 6. Write a program to iterate over the array and print its elements. (Use while loop)
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //        Taking array size input from user
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of array: ");

//        Taking array element input from use
        int index = 0;
        while (index < size)
        {
            System.out.print("Enter the element of "+ index + " index: ");
            array[index] = sc.nextInt();
            index++;
        }

//        The elements of the array are
        System.out.print("\nThe Elements of the array are: ");
        index = 0;
        while (index < size)
        {
            System.out.print(array[index]+ ", ");
            index++;
        }


    }

}
