//Q-9  Write a program to find greatest and least of 3 numbers.

package com.msubaroda.Anurag.assignment;
import java.util.Scanner;


public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the First Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the First Number: ");
        int num3 = sc.nextInt();

//        Conditons for Greatest Number
        if ((num1 > num2) && (num1 > num3)){
            System.out.println("The Greatest number is: " + num1);
        }
        else if ((num2 > num1) && (num2 > num3)){
            System.out.println("The Greatest number is: " + num2);
        }
        else if ((num3 > num1) && (num3 > num2)){
            System.out.println("The Greatest number is: " + num3);
        }

//        Condition for Smallest
        if ((num1 < num2) && (num1 < num3)){
            System.out.println("The Smallest number is: " + num1);
        }
        else if ((num2 < num1) && (num2 < num3)){
            System.out.println("The Smallest number is: " + num2);
        }
        else if ((num3 < num1) && (num3 < num2)){
            System.out.println("The Smallest number is: " + num3);
        }


    }
}
