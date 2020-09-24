// 28. Write a program to create an array of strings.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of string u want in an array: ");
        int size = sc.nextInt();
        String str_array[] = new String[size];

//        taking user input string
        System.out.println("Enter the strings in array: ");
        for (int i = 0; i < str_array.length; i++)
        {
            System.out.print("Enter the string of " + i + " index: ");
            str_array[i] = sc.next();
        }

//        printing the string array
        System.out.println("The strings in the array are: ");
        for (String str: str_array)
            System.out.println(str);


    }

}
