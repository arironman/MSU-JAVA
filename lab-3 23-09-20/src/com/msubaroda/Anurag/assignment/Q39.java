// 39. Write a program to find reverse of a string.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        StringBuilder string_builder=new StringBuilder(string);
        System.out.println("The reverse of the string is: " + string_builder.reverse());


    }

}
