//Q-10  What is the use of instanceof operator. Write a program to prove your points.


package com.msubaroda.Anurag.assignment;

class test {}

class Q10
{
    public static void main(String[] args)
    {
        test t1 = new test();

        System.out.println("Is t1 an instance of test: " + (t1 instanceof test));
    }

}
