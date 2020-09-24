// 3.Create an array of character types. Can we convert this array into a String?If yes, please do.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of character array: ");
        int size = sc.nextInt();
        char array[] = new char[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++)
        {
            System.out.format("Enter the %d Element of array: ", i);
            array[i] = sc.next().charAt(0);

        }
        System.out.print("The Character array is: ");
        for (char element: array) {
            System.out.print(element + ", ");
        }

//        converting char array to String
        String string = new String(array);
        System.out.println("\nThe converted String is: "+ string);


    }

}
