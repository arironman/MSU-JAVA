// 35. Write a program to toggle case of each character of a string.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        System.out.print("The toggled string is: ");

        for (int i = 0 ; i < string.length(); i++)
        {
            if (Character.isLowerCase(string.charAt(i)))
                System.out.print(Character.toUpperCase(string.charAt(i)));
            else
                System.out.print(Character.toLowerCase(string.charAt(i)));
        }


    }

}
