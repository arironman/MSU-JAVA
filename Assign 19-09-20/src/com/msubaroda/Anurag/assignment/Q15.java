//15. Write a program to generate 50 Fibonacci numbers

package com.msubaroda.Anurag.assignment;
import java.util.Scanner;


public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many fibonacci series u want: ");
        int number = sc.nextInt();
        int first = 0, second = 1, third;
        if(number > 1)
            System.out.print( first + " ");
        if (number > 2)
            System.out.print(second + " ");

        for (int i = 2; i < number; i++ )
        {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

}
