package com.msubaroda.Anurag.lab1;
import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        Character ch = sc.next().charAt(0);
        if (Character.isDigit(ch)){
            System.out.println(ch + " is Digit.");
        }
        else if (Character.isLetter(ch)){
            System.out.println(ch + " is a Alphabet.");
        }
        else {
            System.out.println(ch + " is a Special character.");
        }
    }
}
