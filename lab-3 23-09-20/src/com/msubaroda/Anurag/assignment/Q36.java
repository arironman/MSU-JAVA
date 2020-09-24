// 36. Write a program to find total number of alphabets, digits or special character im a string.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        int char_count = 0, digit_count = 0, special_count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isAlphabetic(string.charAt(i)))
                char_count++;
            else if (Character.isDigit(string.charAt(i)))
                digit_count++;
            else
                special_count++;
        }

        System.out.println("The number of Alphabets are: " + char_count);
        System.out.println("The number of digits are: " + digit_count);
        System.out.println("The number of special character are: " + special_count);


    }

}
