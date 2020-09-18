package com.msubaroda.Anurag.assignment;
//Q-11  Write a program to accept the details of a student (Name, father’s name, university name, program name, year, CGPA till previous semester, Mobile No., Adhar No., ) of your class and print the values.

import java.util.Scanner;
public class Q11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter father’s name:");
        String fname = sc.next();
        System.out.println("Enter university name:");
        String uni = sc.next();
        System.out.println("Enter program name:");
        String prog = sc.next();
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter CGPA:");
        Double cgpa = sc.nextDouble();
        System.out.println("Enter Mobile No:");
        Double mob = sc.nextDouble();
        System.out.println("Enter Aadhar No:");
        Double adhar = sc.nextDouble();


        System.out.println("Name: " + name);
        System.out.println("Father’s Name: " + fname);
        System.out.println("University Name: " + uni);
        System.out.println("Program Name: " + prog);
        System.out.println("Year: " + year);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Mobile No: " + mob);
        System.out.println("Aadhar No: " + adhar);
    }
}
