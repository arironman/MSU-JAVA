// 31. Write a program to concatenate two strings.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String string1 = sc.next();

        System.out.print("Enter the string 2: ");
        String string2 = sc.next();

        String string3 = string1 + string2;
        System.out.println("The value of string concatenation is: " + string3);


    }

}
