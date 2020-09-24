// 20. Write a program to create a zagged array of integer type.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Taking array size input from user
        System.out.print("Enter the number of rows u want in array: ");
        int rows = sc.nextInt();
//      creating array
        int array[][] = new int[rows][];
        System.out.println("Enter the elements of array: ");

//      jagged array
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns u want in " + i + " row: ");
            int cols = sc.nextInt();
            array[i] = new int[cols];
        }


//        Taking array element input from use
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the element of " + i + " row index and " + j + " column index: ");
                array[i][j] = sc.nextInt();
            }
        }


//       printing array elements
        System.out.println("\nThe Elements of the 2D-array(Matrix) are: ");
        for (int i = 0; i < rows; i++)
        {
            System.out.print("\t\t\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }



    }

}
