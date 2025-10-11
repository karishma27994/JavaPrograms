package practice.javaprograms.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab002_InvertedRightAnglePattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        try {
            int n = Integer.parseInt(br.readLine());
            if (n > 0 ) {
                for (int i = n; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
            else
                System.out.println("Enter a valid number");

        } catch (NumberFormatException e) {
            System.out.println("Enter a positive integer number");
        }

    }
}
