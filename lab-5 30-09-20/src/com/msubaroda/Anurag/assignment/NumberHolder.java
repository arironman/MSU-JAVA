//4. Given the following class, called NumberHolder, write some code that creates an
//instance of the class, initializes its two member variables, and then displays the value
//of each member variable.
//
//public class NumberHolder {
//public int anInt;
//public float aFloat;

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberHolder obj = new NumberHolder();
        System.out.print("Enter the value of anInt variable: ");
        obj.anInt = sc.nextInt();
        System.out.print("Enter the value of aFloat variable: ");
        obj.aFloat = sc.nextFloat();
        System.out.println("The value of anInt is: " + obj.anInt );
        System.out.println("The value of aFloat is: " + obj.aFloat);

    }

}
