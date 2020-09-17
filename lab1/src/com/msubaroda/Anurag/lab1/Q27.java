package com.msubaroda.Anurag.lab1;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 0; i<pow; i++){
            result *= base;
        }
        System.out.println("The output is: " + result);
    }
}
