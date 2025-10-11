package practice.javaprograms.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab004_FactorialUsingForLoop {
    public static void main(String[] args) {
        /*Factorial is a product of positive number from 1 to that number(n!).
        By definition factorial of zero(0!) is 1*/
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (sc.hasNextInt()) //Checks if the next token/value can be interpreted as an integer
        {
            int n = sc.nextInt();  //reads and consumes the integer value
            if (n < 0 )
                System.out.println("Enter a valid integer value");
            else if (n == 0)
                    System.out.println("Factorial of a zero is: " + 1);
            else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;

                }
                System.out.printf("Factorial of a number %d is %d", n, fact);
            }


        }
        else System.out.println("Enter an integer number");

    }
}

