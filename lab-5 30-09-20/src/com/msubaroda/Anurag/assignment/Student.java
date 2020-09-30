// Q5.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

//i. Creates a Student class, take rolINo and name as a field of this class, and print the
//values of these fields in main class without assigning values to the fileds.
public class Student {
    Scanner sc = new Scanner(System.in);


    int rollNo;
    String name;

    public void print_value()
    {
        System.out.println("The Roll Number is: " + rollNo);
        System.out.println("The Name is: " + name);
    }

    //ii. Assign the value of id as 'your rollNo' and that of name as "your name" by creating an
    //object of the class Student.
    //iii. Assign the value of id as ‘your rollNo' and that of name as "your name" by creating a
    //method (not the constructor) of the class Student.

    public void assign_value()
    {
        System.out.print("Enter the Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter the Name: ");
        name = sc.next();
        System.out.println("Roll Number And Name Are Added Sucessfully !");
    }


    //iv. Assign and print the roll number, and name of two students respectively by creating
    //two objects of class ‘Student’.
    public void assign_display()
    {
        System.out.print("Enter the Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter the Name: ");
        name = sc.next();
        System.out.println("Roll Number And Name Are Added Sucessfully !");
        System.out.println("The Roll Number is: " + rollNo);
        System.out.println("The Name is: " + name);

    }

    //vii. Add an empty default constructor in the previous program.
    public Student()
    {

    }

//viii. Add a parameterised constructor in the previous program and initialize the values of
//rollNo and name.
        public Student(String s_name, int Roll)
        {
            name = s_name;
            rollNo = Roll;
        }


    //vi. Add getter and setter methods in the previous program for rolINo and name.
//     getter for name
    public String getName()
    {
        return name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

//    setter
    public void setName(String new_name)
    {
        name = new_name;
    }
    public void setRollNo(int new_roll)
    {
        rollNo = new_roll;
    }

    public static void main(String[] args) {

//v. Assign and print the roll number, and name of five students respectively by creating
//five objects of class 'Student’.
    Student obj[] = new Student[5];
    for (int i = 0; i < 5 ; i++)
    {
        obj[i] = new Student();
        System.out.println("Enter the value of Student " + i+1);
        obj[i].assign_value();
        obj[i].print_value();

    }


    }

}
