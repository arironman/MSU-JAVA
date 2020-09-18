//Q-14  Write a program to convert Farenheit to Celsius and vice versa.
package com.msubaroda.Anurag.assignment;
import java.util.Scanner;

class Q14
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to convert farenheit to celcius or Press 2 to convert celcius to farenheit: ");
        int choice = sc.nextInt();
        int temp = 0;
        boolean cel = false;
        switch (choice){
            case 1:
                System.out.println("Enter the temperature in Fareneit: ");
                temp = sc.nextInt();
                cel = false;
                break;

            case 2:
                System.out.println("Enter the temperature in Celcius: ");
                temp = sc.nextInt();
                cel = true;
                break;
            default:
                System.out.println("Invalid Credentials !!! ");
                System.exit(0);
        }

        if (cel){
            int convertTemp = ((temp * 9)/5)+32;
            System.out.println("Temperature in Farenheit is: " + convertTemp);
        }
        else {
            int convertTemp = ((temp - 32)* 5)/ 9;
            System.out.println("Temperature in Celcius is: " + convertTemp);
        }
    }
}