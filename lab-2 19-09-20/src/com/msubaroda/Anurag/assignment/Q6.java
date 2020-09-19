package com.msubaroda.Anurag.assignment;
//Q-6    Write a program to calculate sum of n natural numbers.


import java.util.Scanner;
public class Q6
{
    public static void main(String args[])
    {
        int sum = 0;
        System.out.print("Enter the number value: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<num+1; i++)
        {
            sum = sum +i;
        }

        System.out.println("Sum of numbers : "+sum);
    }
}

