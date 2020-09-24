// 38. Write a program to count total number of words in a string.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        System.out.println("The number of words in the string: " + string.split(" ").length);


    }

}
