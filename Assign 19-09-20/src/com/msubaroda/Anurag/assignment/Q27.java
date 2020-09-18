//27. Write a program which prints
//*
//**
//***
//****
//*****

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows u want in pattern: ");
        int number = sc.nextInt();
        for (int i = 1; i < number+1; i++)
        {
            for (int j=0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }

    }

}
