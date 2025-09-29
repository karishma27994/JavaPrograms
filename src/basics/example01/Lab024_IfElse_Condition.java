package basics.example01;

import java.util.Scanner;

public class Lab024_IfElse_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //User input take using Scanner class
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You can vote");
        }
        else
            System.out.println("You cannot vote");
    }
}
