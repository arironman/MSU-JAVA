package com.msubaroda.Anurag.lab1;
//importing Sscanner module to take input from user
import java.util.Scanner;


public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number whose factorial you want: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i<num+1; i++){
            result = result * i;
        }
        System.out.println("Factorial of the Number is: " + result);
    }
}
