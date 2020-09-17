package com.msubaroda.Anurag.lab1;
// help to take user input
import java.util.Scanner;

public class Q12 {
//    main static methord which can execute without using object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight in kgs: ");
        int weight = sc.nextInt();
        System.out.print("Enter the Height in meters: ");
        int height = sc.nextInt();
        float BMI = weight/(height * height);
        System.out.println("The BMI is: "+ BMI);
    }
}
