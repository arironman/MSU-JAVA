// Q7.
//
//i. Write a program that would print the information (name, year of joining, salary,
//address) of three employees by creating a class named ‘Employee’. The output should
//be as follows:
//
//Name Year of joining Address
//
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat
//
//[Hint: use System.out.printfQ) for formatted output]
package com.msubaroda.Anurag.assignment;

import org.w3c.dom.ls.LSParser;

import java.util.Scanner;

class Employee
{
    String Name, Address, Salary;
    long YearOfJoining;

    public Employee(String name, String address, String salary, long yearOfJoining)
    {
        Name = name;
        Address = address;
        Salary = salary;
        YearOfJoining = yearOfJoining;
    }

    public void display_data()
    {
        String Space= " ";
        int name_len = 14 - Name.length();
        System.out.print(Name);
        for (int i = 0; i < name_len  ; i++)
            System.out.print(Space);
        int salary_len = 14 - Salary.length();
        System.out.print(Salary);
        for (int i = 0; i < salary_len ; i++)
            System.out.print(Space);
        System.out.print(YearOfJoining);
        for (int i = 0; i < 3 ; i++)
            System.out.print(Space);
        System.out.println(Address);
    }

}


public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employee");
        int num = sc.nextInt();
        String name , address, salary;
        long year;
        Employee obj[] = new Employee[num];
        for (int i = 0; i < num ; i++)
        {
            System.out.println("Enter the Data Of Employee " + i+1);
            System.out.print("Enter the Name: ");
            name = sc.next();
            System.out.print("Emter the Salary: ");
            salary = sc.next();
            System.out.print("Enter the Address: ");
            address = sc.next();
            System.out.print("Enter the Year Of Joining: ");
            year = sc.nextLong();
            obj[i] = new Employee(name, address, salary, year);

        }

        System.out.println("Name<-------->Salary<-->Year<->Address");
        for (int i = 0; i < num ; i++)
        {
            obj[i].display_data();
        }

    }

}
