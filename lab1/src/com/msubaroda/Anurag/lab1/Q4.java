package com.msubaroda.Anurag.lab1;
// here we are importing java class scanner wich help us to take user input
import java.util.Scanner;

public class Q4 {
//    main methord which help to to show output with out creating object because it is static class
    public static void main(String[] args) {
//        here we create the scanner class object which help us to use ite functionality in program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
//        takin input from user with the help of sc object
        int num = sc.nextInt();
//        if statement in java
        if (num%5 == 0){
            System.out.println("The Number is divisible by 5.");
        }
        else {
            System.out.println("The Number is not divisible by 5.");
        }
    }

}
