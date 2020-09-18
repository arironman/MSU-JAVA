package com.msubaroda.Anurag.assignment;
//13. Redo the above and print every statement in new line using a single print().


import java.util.Scanner;
public class Q13
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

//        I am ___, My father’s name is ___. I am doing ___ from ____.
//        My CGPA till previous semester is__. My Mobile Number and Adhar Numbers are____________.


        System.out.println("I am " + name +
                ", My father's name " + fname +
                ". I am doing " + prog +
                " from " + uni +
                ". My CGPA till previous semester is " + cgpa +
                ". My mobile number and Adhaar number are " + mob + adhar);
    }
}
