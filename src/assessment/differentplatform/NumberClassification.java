package assessment.differentplatform;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(!sc.hasNextInt())
            System.out.println("Enter a valid number");
        else
        {
            int num = sc.nextInt();
            if(num>0)
                System.out.println("Its a positive number: " + num);
            else if (num==0)
                System.out.println("Number is equal to 0");
            else System.out.println("Its a negative number: " + num);
        }
    }
}
