package basics.forwhile.loops;
import java.util.*;

public class PrintSum_First10NaturalNos_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit to which natural nos needs to be added");
        int sum = 0;
        if (sc.hasNextByte()) {
            byte number = sc.nextByte();
            if (number<=0)
            {
                System.out.println("Enter a positive number");
            }
            else {
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println("Sum of natural nos is: " + sum);
            }
        }
        else {
            System.out.println("Enter a valid integer number within byte range");
        }
        sc.close();
    }
}

