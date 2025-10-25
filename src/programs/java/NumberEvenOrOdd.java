package programs.java;
import java.util.*;

public class NumberEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            if (number%2==0)
                System.out.println("Number is even");
            else
                System.out.println("Number is odd");
            }

        else System.out.println("Enter an integer number");
        sc.close();
    }
}
