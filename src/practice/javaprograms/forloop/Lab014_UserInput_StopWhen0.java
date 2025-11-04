package practice.javaprograms.forloop;
import java.util.Scanner;

public class Lab014_UserInput_StopWhen0 {
    //Take user input continuously, and stop only when user enters 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers and stop when 0 is entered");
        if(sc.hasNextInt())
        {
            for ( ; ; )
            {
                int number = sc.nextInt();
                System.out.println("Number entered is: " + number);
                if (number==0)
                {
                    System.out.printf("Inputted number is %d so stopping the inputs now", number);
                    break;
                }
            }
        }
        else
            System.out.println("Enter a valid integer number");
        sc.close();

    }
}
