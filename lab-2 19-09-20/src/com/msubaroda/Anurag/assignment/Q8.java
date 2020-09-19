package com.msubaroda.Anurag.assignment;
//Q-8  Write a program to calculate product of two integer numbers without using * operator.


import java.util.*;
public class Q8
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        int result = 0;
        for(int i = 0; i < num2; i++ )
        {
            result += num1;
        }

        System.out.println("Result: " + result);
    }

}
