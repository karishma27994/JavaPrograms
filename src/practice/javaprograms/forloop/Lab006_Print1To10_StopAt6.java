package practice.javaprograms.forloop;

import java.util.Scanner;

public class Lab006_Print1To10_StopAt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit till where we need to print");
        if(sc.hasNextInt())
        {
            int limit = sc.nextInt();
            if (limit<=0)
                System.out.println("Enter a positive number greater than 0");
            else {
                for (int i = 1; i <= limit; i++) {
                    if (i == 6)
                        break;
                    System.out.println(i);


                }
            }
        }
        else System.out.println("Enter a valid integer number");
        sc.close();
    }
}
