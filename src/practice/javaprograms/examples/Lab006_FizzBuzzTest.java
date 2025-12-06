package practice.javaprograms;

import java.util.Scanner;

public class Lab006_FizzBuzzTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(1 to 100)");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter an integer number");
        }
        else
        {
            int number = sc.nextInt();
            if(number <= 0 || number > 100)
                System.out.println("Enter a number between 1 to 100");
            else
            {
                for(int i =1; i<=number; i++)
                {
                    if ((i%3 == 0) && (i%5 ==0))
                        System.out.println("FizzBuzz");
                    else if(i%3 == 0)
                        System.out.println("Fizz");
                    else if (i%5 == 0)
                        System.out.println("Buzz");
                    else
                        System.out.println(i);

                    }
                }
            }
        }
    }

