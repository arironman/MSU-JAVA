package com.msubaroda.Anurag.lab1;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String days[] = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        System.out.println("Enter the Day Number: ");
        int day = sc.nextInt();
        System.out.println(days[day-1]);

    }
}
