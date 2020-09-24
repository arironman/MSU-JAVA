// 14. Write a program to find the frequency of each element in the array.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q14 {
    public void frequency(int [] array){
        int elements[] = new int[array.length];
        int freq[] = new int[array.length];

        int index = 0;
        boolean element_found = false;
        for (int i = 0; i < array.length; i++)
        {
            element_found = false;
            for ( int j = 0; j < array.length; j++)
            {
                if (elements[j] == array[i])
                {
                    freq[j] = freq[j] + 1;
                    element_found = true;
                    break;
                }
            }
            if (!element_found)
            {
                elements[index] = array[i];
                freq[index] = 1;
                index++;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            if (elements[i] == 0)
                break;
            System.out.println("Element " + elements[i] + " has " + freq[i] + " frequency ");
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements of array: ");

//        Taking array element input from user
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter the element of "+ i + " index: ");
            array[i] = sc.nextInt();
        }

//      code for frequency

//        creating object to call method
        Q14 object = new Q14();
        object.frequency(array);


    }

}
