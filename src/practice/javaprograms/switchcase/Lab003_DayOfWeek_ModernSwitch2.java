package practice.javaprograms.switchcase;

import java.util.Scanner;

public class Lab003_DayOfWeek_ModernSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = sc.nextInt();
        switch(day)
        {
            case 1,2,3,4,5-> System.out.println("Weekday");
            case 6,7-> System.out.println("Weekend");
            default -> System.out.println("Enter a number within range 1 to 7");
        }
    }
}
