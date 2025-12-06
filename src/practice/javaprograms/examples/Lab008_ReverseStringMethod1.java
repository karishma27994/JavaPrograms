package practice.javaprograms.examples;
import java.util.Scanner;

public class Lab008_ReverseStringMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String reverse = "";

            String str = sc.nextLine().trim();
            for(int i = str.length()-1; i>=0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            System.out.println(reverse);

    }
}
