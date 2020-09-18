package com.msubaroda.Anurag.assignment;
//Q-5   Write a program to calculate area of a square.
import java.util.Scanner;
public class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side in meters: ");
        int side = sc.nextInt();

        System.out.println("Area of the square is: "+ side*side);
    }
}
