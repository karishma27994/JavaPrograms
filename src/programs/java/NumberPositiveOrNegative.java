package programs.java;
import java.util.*;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            if( number <0)
                System.out.println("Number is negative");
            else if (number>0)
                System.out.println("Number is positive");
            else System.out.println("Entered number is 0");
        }
        else {
            System.out.println("Enter a valid integer number");
        }
        sc.close();
    }

}
