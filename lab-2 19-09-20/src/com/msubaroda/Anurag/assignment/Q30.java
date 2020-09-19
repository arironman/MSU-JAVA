//30. Write a program to calculate the electricity bill by reading the figures of current and previous months.
// Tariff is given below:
//Unit Slabs        Tariff Rates
//First 150 units       2.75
// Next 250 units       4.80
//Next 600 units        5.20
//Above 1000 units      9.90


package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Units: ");
        int units = sc.nextInt();
        double total = 0;
        if (units <= 150)
        {
            total = (2.75 * units);
        }
        else if ( (units-150) <= 250)
        {
            total = (150 * 2.75) + ((units - 150)*4.80);
        }
        else if ( (units-400) <= 600)
        {
            total = (150 * 2.75) + (250 * 4.80) + ((units - 400)*5.20);
        }
        else
            total = (150 * 2.75) + (250 * 4.80) + (600 * 5.20) + ((units - 1000)*9.90);

        System.out.println("The total Amount is: " + total);



    }

}
