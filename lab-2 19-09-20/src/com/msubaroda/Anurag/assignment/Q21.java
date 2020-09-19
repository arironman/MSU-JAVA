//21. Write a program to test the primality of a number.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                System.out.println("Number is not prime");
                System.exit(0);
            }
        }
        System.out.println("Number is a Prime Number");


    }

}
