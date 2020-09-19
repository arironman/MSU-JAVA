//4. Solve the above problem by taking a constant PI = 3.1414 in your program.
// Hint: take a final variable.

package com.msubaroda.Anurag.assignment;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        final float pi = 3.1414f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = sc.nextFloat();
        float area = pi*radius*radius;
        System.out.println("The area of the circle is: " + area);
    }
}
