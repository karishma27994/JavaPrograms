package programs.java;

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int totalnum = 2;
        int validinputs = 0;
        int max = Integer.MIN_VALUE;
        while (totalnum > validinputs) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > max) {
                    max = number;
                }
                validinputs++;
            }
             else
            {
                System.out.println("Enter a valid integer number");
                sc.next();
            }
        }
        System.out.println("Maximum number is: " + max);
        sc.close();
        }
    }




