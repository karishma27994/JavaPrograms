package programs.java;
import java.util.*;

public class EligibleToVote_AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age");
        if (sc.hasNextInt())
        {
            int age = sc.nextInt();
            if (age<=0)
                System.out.println("Please enter age greater than 0");
            else if(age <18)
                System.out.println("Not eligible for vote");
            else
                System.out.println("Eligible for vote");
        }
        else
            System.out.println("Enter a positive integer number");
        sc.close();
    }

}
