// 26. Write a program to multiply a matrix with a scaler.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q26 {

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


    //    method to multiply matrix
    public int[][] scalar_product(int [][] matrix, int num)
    {
        int temp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j <  matrix[i].length; j++)
            {
                temp[i][j] = num * matrix[i][j];
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
        Q26 object = new Q26();

//      creating array
        System.out.println("\n\tEnter the elements of matrix1: ");
        int matrix[][] = object.array_input(rows, cols);


//       printing Matrix elements
        System.out.println("\nMatrix 1 is: ");
        object.matrix_display(matrix);

//        multiplying matrix
        System.out.println("\n\nEnter the Number which u want to multiply with matrix: ");
        int num = sc.nextInt();
        System.out.println("\nThe product of the" + num +"and matrixes is: \n");
        int result[][] = object.scalar_product(matrix, num);
        object.matrix_display(result);

    }

}
