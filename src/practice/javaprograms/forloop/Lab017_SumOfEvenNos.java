package practice.javaprograms.forloop;
import java.util.*;

public class Lab017_SumOfEvenNos {
    //Find the sum of the first 10 even numbers using a for loop with continue to skip odd ones.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int sum = 0, counter = 0;
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter a positive number");
            } else {
                for (int i = 1; i <= n; i++) {
                    if ((i % 2 == 0) && (counter <= 10)) {
                        sum += i;
                        counter++;
                    } else {
                        continue;
                    }
                }
                System.out.println("Sum of first 10 even numbers is: " + sum);
            }
        }
        else
            {
                System.out.println("Enter an integer number");
            }
            sc.close();
    }
}
