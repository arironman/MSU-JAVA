//23. Write a loop (for and while both) which runs from 1-10 but prints only values from 1-6.
package com.msubaroda.Anurag.assignment;


public class Q23 {
    public static void main(String[] args) {
//        for loop
        for (int i = 1; i < 11; i++)
        {
            if (i < 7)
                System.out.print(i);
        }
//      while loop
        System.out.println();
        int i = 1;
        while (i < 11)
        {
            if (i < 7)
                System.out.print(i);
            i++;
        }

    }

}
