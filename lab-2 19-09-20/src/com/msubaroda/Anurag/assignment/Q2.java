//2. Go to the following link and solve the problem. Submit your code along with the test report.
// https://www.hackerrank.com/challenges/java-if-else/problem

package com.msubaroda.Anurag.assignment;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Number = sc.nextInt();
        if (Number % 2 == 0){
            if ((Number < 20) || (Number > 5)){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}
