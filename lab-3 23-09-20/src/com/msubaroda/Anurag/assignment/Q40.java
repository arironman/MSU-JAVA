// 40. Write a program to check whether a string is palindrome or not.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        StringBuilder string_builder=new StringBuilder(string);
//        System.out.println(string_builder.reverse().toString().toLowerCase());
//        System.out.println(string.toLowerCase());
//        System.out.println(string.toLowerCase().equals(string_builder.reverse().toString().toLowerCase()));
        if (string.toLowerCase().equals(string_builder.reverse().toString().toLowerCase()))
            System.out.println("The string is palindrome.");
        else
            System.out.println("String is not palindrome.");


    }

}
