package com.msubaroda.Anurag.assignment;
//Q-7   Write a program to calculate product of n natural numbers.
import java.util.Scanner;
public class Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Natural Number product u want: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i < num+1; i++)
        {
            result *= i;
        }

        System.out.println("Product of the " + num + " numbers is: "+result);
    }
}
