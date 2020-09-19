//Q-3   Write a program to calculate the area of a circle. Use the value of PI from Math class.

package com.msubaroda.Anurag.assignment;
import java.util.Scanner;

public class Q3 {
    public static void main(String args[])
    {
        System.out.print("Enter the radius: ");

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
    }

}
