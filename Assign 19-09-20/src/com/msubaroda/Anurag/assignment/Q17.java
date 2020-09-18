//17. Write a program to divide and multiply a number by 2 without using / and * operator.
//        Hint: use >> and << operators.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num2, num1;
        System.out.print("Enter the number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = sc.nextInt();
//      Multiplication
        int mul = 0, count = 0, div = 0, temp = num2;
        while (temp > 0)
        {
            if (temp % 2 == 1) {
                mul += num1 << count;
                }
            count++;
            temp /= 2;
        }
        System.out.println("The multiplication of " + num1 + " and " + num2 + "is: " + mul);

    }

}
