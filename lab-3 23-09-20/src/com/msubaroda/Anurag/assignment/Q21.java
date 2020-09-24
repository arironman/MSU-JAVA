// 21. Write a program to find the frequency of odd & even numbers in the given matrix

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q21 {
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
        int odd_freq = 0, even_freq = 0;
        for (int i = 0; i < rows; i++)
        {
            System.out.print("\t\t\t");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]+" ");
                if (array[i][j] % 2 == 0)
                    even_freq++;
                else
                    odd_freq++;

            }
            System.out.println();
        }
        System.out.println("\n The even frequency of elements are: " + even_freq + "\n The odd frequency of elements are: " + odd_freq);


    }

    }


