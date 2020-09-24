//  24. Write a program to add two matrices

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q24 {

    //   method to take array input from user
    public int[][] array_input(int rows, int cols) {
        int array[][] = new int[rows][cols] ;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++ )
        {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element of " + i + " row index and " + j + " column index.: ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;

    }


    //    method to display matrix
    public void matrix_display(int [][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("\t\t\t\t\t");
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }


    //    method to add matrix
    public int[][] add(int [][] matrix1, int [][] matrix2)
    {
        int temp[][] = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j <  matrix1[i].length; j++)
            {
                temp[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return temp;
    }

    //    main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Taking array size input from user
        System.out.print("Enter the number of rows u want in array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns u want in array: ");
        int cols = sc.nextInt();

//        creating object to use the methods
        Q24 object = new Q24();

//      creating array
        System.out.println("\n\tEnter the elements of matrix1: ");
        int matrix1[][] = object.array_input(rows, cols);
        System.out.println("\n\tEnter the elements of matrix2: ");
        int matrix2[][] = object.array_input(rows, cols);


//       printing Matrix elements
        System.out.println("\nMatrix 1 is: ");
        object.matrix_display(matrix1);
        System.out.println("\n\nThe matrix 2 is: ");
        object.matrix_display(matrix2);


//        adding matrix
        System.out.println("\n\nThe sum of the both matrixes are: ");
        int result[][] = object.add(matrix1, matrix2);
        object.matrix_display(result);

    }


}
