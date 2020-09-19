//24. Write a loop (for and while both) which runs from 1-10 but prints only values from 1-10 except 7.
package com.msubaroda.Anurag.assignment;


public class Q24 {
    public static void main(String[] args) {
        int j = 1;
        boolean print = true;
        while (j < 11)
        {
            print = true;
            for (int i = 2; i < j; i++)
            {
                if (j%i == 0)
                    print = false;

            }

            if (print && (j != 1) && (j != 7))
                System.out.print(j + " ");
            j++;
        }


    }

}
