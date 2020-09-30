//Q6.
//i. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
//units by creating a class named 'Triangle' without any parameter in its constructor.
//
//ii. Create a class Rectangle and calculate the area of the rectangle of 3 rectangles.
//
//iii. In the previous program, check that an object is the instance of the class Rectangle or
//not.
//
//iv. In the previous program, create the object with var.
//
//v. In the previous program, create an anonymous object.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

class Triangle
{
    int side1, side2, side3;

    //i. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    //units by creating a class named 'Triangle' without any parameter in its constructor.
    public Triangle()
    {

    }

//    easy to understand while creating anonymous object
    public Triangle(int side_1, int side_2, int side_3)
    {
        side1 = side_1;
        side2 = side_2;
        side3 = side_3;
        System.out.println("Sides are: " + side1 + " " + side2 + " " + side3);
    }
}

class Rectangle_
{
    int length, width;

    //ii. Create a class Rectangle and calculate the area of the rectangle of 3 rectangles.
    public int area()
    {
        return length * width;
    }

}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //v. In the previous program, create an anonymous object.
        new Triangle(1,2,3);
        //iv. In the previous program, create the object with var.
        Rectangle_ obj = new Rectangle_();
        obj.length = 10;
        obj.width = 20;
        System.out.println("The Area Of The Rectangle Is: " + obj.area());

    }

}
