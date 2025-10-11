package practice.javaprograms.pattern;

import java.util.Scanner;

public class Lab001_RightAnglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0)
                System.out.println("Enter value within range");
            else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

        else
        {
            System.out.println("Enter a valid number");
        }
    }
}
