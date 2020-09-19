//25. Write program which runs from 1-500 and stops as soon as the sum of all the previous terms happens 800.
package com.msubaroda.Anurag.assignment;


public class Q25 {
    public static void main(String[] args) {
        int sum = 0;
    for (int i = 1; i < 501; i++)
    {
        sum += i;
        System.out.print(i + " ");
        if (sum > 800)
            System.exit(0);
    }

    }

}
