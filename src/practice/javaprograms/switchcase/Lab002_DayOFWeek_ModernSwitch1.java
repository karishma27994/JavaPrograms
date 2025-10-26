package practice.javaprograms.switchcase;

import java.util.Scanner;

public class Lab002_DayOFWeek_ModernSwitch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        if (sc.hasNextInt())
        {
            int day = sc.nextInt();
            // This code will work with Java above 13
            switch (day)
            {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Enter a number between 1 to 7");
            }
        }

        else System.out.println("Enter an integer number");

        sc.close();

    }
}
