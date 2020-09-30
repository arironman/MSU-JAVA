//1. What's wrong with the following program?
//
//public class SomethingIsWrong {
//public static void main(String[] args) {
//Rectangle myRect; //something missing here
//myRect.width = 40;
//myRect.height = 50;
//System.out.printin("myRect's area is " + myRect.area());
//
//2. Fix the program called SomethingIsWrong shown in Question 1 by adding appropriate fields
//and methods to make is function.
//
//3. Complete the program called SomethingIsWrong shown in Question 1 by adding appropriate
//fields and methods to make is function.


package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

class Rectangle
{
    int width;
    int height;
    public int area()
    {
        return height * width;
    }
}

// I use Q1_to_Q3 as a class name instead of SomethingIsWrong
// Because it is easy to manage file according to question numbers
public class Q1_to_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle myRect = new Rectangle(); //something missing here
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());

    }

}
