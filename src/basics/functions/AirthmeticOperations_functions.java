package basics.functions;

import java.util.Scanner;

public class AirthmeticOperations_functions {

    public static int readInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else
        {
            System.out.println("Enter an integer value");
           System.exit(0);
            return 0;
        }
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        if (b==0)
        {
            System.out.println("Division by 0 error");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = readInput(sc,"Enter number 1");
        int b = readInput(sc,"Enter number 2");
        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);

    }
}
