package com.msubaroda.Anurag.lab1;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("The first variable is: " + num1);
        System.out.println("The second variable is: " + num2);
    }

}
