package programs.java;

import java.util.Scanner;

public class NumberDivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            if (num<=0)
                System.out.println("Enter a positive number");
            else if((num%5==0) && (num%11==0))
                    System.out.printf("Number %d is divisible by both 5 and 11", +num);
                else System.out.printf("Number %d is not divisible by both 5 and 11", +num);

        }
        else {
            System.out.println("Enter a valid integer number");
        }
        sc.close();
    }
}
