// 37. Write a program to count total number of vowels and consonants in a string.

package com.msubaroda.Anurag.assignment;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        int vowel_count = 0, consonent_count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            char temp = Character.toLowerCase(string.charAt(i));
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' )
                vowel_count++;
            else
                consonent_count++;
        }
        System.out.println("The Number of vowel are: " + vowel_count + " and consonents are:  " + consonent_count);

    }

}
