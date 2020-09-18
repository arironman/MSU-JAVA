//26. Write a program to print a multiplication table of 5 as per given
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number whose multiplication table u want: ");
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++)
        {
            System.out.println(number + " x " + i + " = "+ number*i);
        }


    }

}
