//16. Write a program to print number of days in a month.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        if (month < 13 || month > 0)
        {
            System.out.println("Invalid Credentials !!!");
            System.exit(0);
        }
        if (month == 2)
            System.out.println("This Month has 28 or 29 days.");
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            System.out.println("This Month has 31 days.");
        else
            System.out.println("This Month has 30 days.");
    }

}
