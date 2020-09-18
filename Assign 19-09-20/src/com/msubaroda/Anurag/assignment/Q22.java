//22. Write a program which prints the division of a student based on the marks scored in 5 subjects in HSC.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in subjects 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter marks in subjects 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter marks in subjects 3: ");
        int mark3 = sc.nextInt();
        System.out.print("Enter marks in subjects 4: ");
        int mark4 = sc.nextInt();
        System.out.print("Enter marks in subjects 5: ");
        int mark5 = sc.nextInt();
        int average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
        System.out.println("The Average Marks is: " + average);
    }

}
