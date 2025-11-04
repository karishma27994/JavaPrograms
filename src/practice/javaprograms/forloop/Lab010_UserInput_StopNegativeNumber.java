package practice.javaprograms.forloop;
import java.util.Scanner;

public class Lab010_UserInput_StopNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 10 numbers and stop when negative number is encountered");
        if(sc.hasNextInt())
        {
            for (int i = 0; i < 10; i++) {
                int number = sc.nextInt();
                if (number<0)
                {
                    System.out.printf("Negative number encountered %d is encounters hence coming out off loop",number);
                    break;

                }
                System.out.println("Number entered by user is: "+number);
            }

        }
        else
            System.out.println("Enter an integer number");
        sc.close();
    }
}
