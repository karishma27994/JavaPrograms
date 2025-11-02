package practice.javaprograms.forloop;

import java.util.Scanner;

public class Lab007_Print1to10_Skip5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit till where numbers need to be printed");
        if (sc.hasNextInt())
        {
            int numlimit = sc.nextInt();
            if (numlimit<=0)
                System.out.println("Enter a positive number greater then 0");
            else {
                for (int i = 1; i <=numlimit; i++) {
                    if(i==5)
                        continue;
                    System.out.println(i);
                }
            }
        }
        else
            System.out.println("Enter a valid integer number");
        sc.close();
    }
}
