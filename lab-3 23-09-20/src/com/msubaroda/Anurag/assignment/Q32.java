// 32. Write a program to compare two strings.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String string1 = sc.next();

        System.out.print("Enter the string 2: ");
        String string2 = sc.next();

//        code to compare two strings
        if (string1.length() != string2.length())
        {
            System.out.println("String are not equal");
            System.exit(0);
        }
        for (int i = 0; i < string1.length(); i++)
        {
            if (string1.charAt(i) != string2.charAt(i))
            {
                System.out.println("Strings are not equal");
                System.exit(0);
            }

        }
        System.out.println("Both the strings are Equal.");

    }

}
