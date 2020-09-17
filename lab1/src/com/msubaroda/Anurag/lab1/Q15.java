package com.msubaroda.Anurag.lab1;
import java.util.Scanner;


public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();
        for (int rate = 1; rate < 11; rate++) {

            float si = (principle * rate * time) / 100;
            System.out.println("The simple intrest of rate "+rate+"% is: " + si);

        }

    }
}