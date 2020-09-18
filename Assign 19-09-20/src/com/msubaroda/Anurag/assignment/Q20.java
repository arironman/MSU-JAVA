//20. Write a program to reverse a number.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        int temp = number, digit, reverse = 0;
        while (temp != 0)
        {
            digit = temp % 10;
            reverse = reverse *10 + digit;
            temp /= 10;
        }
        System.out.println(reverse);
    }

}
