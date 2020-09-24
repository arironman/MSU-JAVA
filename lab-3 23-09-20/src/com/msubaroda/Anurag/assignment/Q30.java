// 30. Write a program to copy one string to another string.
package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.next();

//        code copy to copy string
        String string_copy_1 = string;
        System.out.println("The copied string is \"" + string_copy_1 + "\" by assigned method.");



    }

}
