// 22. Write a program to find the sum of each row and each column of a matrix

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Taking array size input from user
        System.out.print("Enter the number of rows u want in array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns u want in array: ");
        int cols = sc.nextInt();

//      creating array
        int array[][] = new int[rows][cols];
        System.out.println("Enter the elements of array: ");


//        Taking array element input from use
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element of " + i + " row index and " + j + " column index: ");
                array[i][j] = sc.nextInt();
            }
        }


//       printing array elements
        System.out.println("\nThe Elements of the 2D-array(Matrix) are: ");
        for (int i = 0; i < rows; i++)
        {
            System.out.print("\t\t\t");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


//        code for sum of column
        int col_sum = 0;
        for (int k = 0; k < cols ; k++) {
            col_sum = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = k; j == k; j++) {
                    col_sum += array[i][j];
                }

            }
            System.out.println("The sum of " + k + " indexed column is: " + col_sum);

        }

        System.out.println();

//        code for sum of row
        int row_sum = 0;
        for (int i = 0; i < rows; i++)
        {
            row_sum = 0;
            for (int j = 0; j < cols; j++) {
                row_sum += array[i][j];
            }
            System.out.println("The sum of " + i + " indexed row is: " + row_sum);
        }


    }

}
