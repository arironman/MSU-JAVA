package com.msubaroda.Anurag.lab1;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter the Rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();
        float si = (principle * rate * time)/100;
        System.out.println("The simple intrest is: " + si);

    }

}
