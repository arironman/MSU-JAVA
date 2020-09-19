//29. Write a program to calculate the area of triangle whose all three sides are given.
// Hint: Use Heron’s formulae. https://en.wikipedia.org/wiki/Heron%27s_formula
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3: ");
        int side3 = sc.nextInt();

        int param = side1 + side2 + side3;
        double area = Math.sqrt(param*(param-side1)*(param-side2)*(param-side3));
        System.out.println("The area of the Triangle is: " + area);
    }

}
