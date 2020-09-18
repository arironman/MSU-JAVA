//28. Write a program to print the eligibility of marriage of based on age and sex of a person.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the gender (like: male/female in lowercase): ");
        String gender = sc.next();
        if (gender == "male")
        {
            if (age > 22)
                System.out.println("You are Eligible for marrage.");
            else
                System.out.println("You are Not Eligible for marrage.");
        }
        else
        {
            if (age > 20)
                System.out.println("You are Eligible for marrage.");
            else
                System.out.println("You are Not Eligible for marrage.");

        }

    }

}
