package practice.javaprograms;

import java.util.Scanner;

public class Lab007_GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        if(!sc.hasNextInt())
            System.out.println("Enter an integer value");
        else {
            int score = sc.nextInt();
            if (score < 0 || score > 100)
                System.out.println("Enter score between 0-100");
            else if (score >= 90)
                    System.out.println("Grade A");
                else if (score >= 80)
                    System.out.println("Grade B");
                else if (score >= 70)
                    System.out.println("Grade C");
                else if (score >= 60)
                    System.out.println("Grade D");
                else System.out.println("Grade F");
            }
        }

        }



