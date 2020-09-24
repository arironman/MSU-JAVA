// 15. Write a program to print the duplicate elements of an array.
package com.msubaroda.Anurag.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public void double_elements(int [] array)
    {
        int elements[] = new int[array.length];
        int double_element[] = new int[array.length];
        boolean element_found = false, double_ele_found = false;
        int double_index = 0, elements_index = 0;
        for (int element: array)
        {
            element_found = false;
            for ( int check_element: elements)
            {
                if (check_element == element)
                {
                    for (int temp: double_element){
                        if (temp == element) {
                            double_ele_found = true;

                            break;
                        }
                        else
                            double_ele_found = false;
                }
                    if (!double_ele_found) {
                        double_element[double_index] = element;
                        double_index++;
                        break;
                    }
                }
            }
            if (!element_found)
            {
                elements[elements_index] = element;
                elements_index++;
            }
        }

        System.out.print("\nThe double Elements are: ");
        for (int element: double_element)
        {
            if (element == 0)
                break;
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Taking array size input from user
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of array: ");

//        Taking array element input from use
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter the element of "+ i + " index: ");
            array[i] = sc.nextInt();
        }

//      code for checking double elements
//      creating object to use the method double_elements
        Q15 object = new Q15();
        object.double_elements(array);

    }

}
