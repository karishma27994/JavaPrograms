package practice.javaprograms.ifelse_switch;

import java.util.Scanner;

public class Lab001_PositiveNumber_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(sc.hasNextInt())
        {
           int number = sc.nextInt();
            if(number >0)
                System.out.println("Number is positive");
            else if(number <0)
            System.out.println("Number is negative");
            else
                System.out.println("Number is neither positive nor negative");

        }
        else System.out.println("Enter whole number");

    }
}
