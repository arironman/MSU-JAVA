// 9. Write a program that sums the elements of a char array.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Taking array size input from user
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        char array[] = new char[size];
        System.out.println("Enter the elements of array: ");

//        Taking array element input from use and making sum of elements
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter the element of "+ i + " index: ");
            array[i] = sc.next().charAt(0);
            sum += array[i];
        }
        System.out.println("\nThe Sum of the elements of the array is: "+ sum);





    }

}
