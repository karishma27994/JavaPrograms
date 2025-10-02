package practice.javaprograms.ifelse_switch;

import java.util.Scanner;

public class Lab003_SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an between 1 to 7");
        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Sunday");

                case 2:
                    System.out.println("Monday");

                case 3:
                    System.out.println("Tuesday");

                case 4:
                    System.out.println("Wednesday");

                case 5:
                    System.out.println("Thursday");

                case 6:
                    System.out.println("Friday");

                case 7:
                    System.out.println("Saturday");

                default:
                    System.out.println("Enter a positive number between 1 to 7");
            }
        }
        else System.out.println("Enter a positive integer number");
    }
}
