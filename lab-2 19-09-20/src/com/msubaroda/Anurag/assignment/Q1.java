//1. Write a program to enter your name and say Hello.
package com.msubaroda.Anurag.assignment;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
