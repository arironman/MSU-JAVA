package com.msubaroda.Anurag.lab1;
// help to take user input
import java.util.Scanner;


public class Q13 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Weight in kgs: ");
            int weight = sc.nextInt();
            System.out.print("Enter the Height in meters: ");
            int height = sc.nextInt();
            float BMI = weight/(height * height);
            System.out.println("The BMI is: "+ BMI);

            if (BMI < 18.6){
                System.out.println("Status : UnderWeight");
            }
            else if(BMI < 25){
                System.out.println("Status : Normal");
            }
            else if (BMI < 30){
                System.out.println("Status : OverWeight");
            }
            else {
                System.out.println("Status : Obese");
            }
    }
}


