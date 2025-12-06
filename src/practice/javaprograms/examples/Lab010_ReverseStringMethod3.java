package practice.javaprograms.examples;
import java.util.Scanner;

public class Lab010_ReverseStringMethod3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Input the string needs to be reversed");
        StringBuilder sb = new StringBuilder(sc.nextLine().replaceAll("\\s+",""));
        for (int i = 0; i < sb.length()/2; i++) {
            int frontIndex = i;
            int endIndex = sb.length()-1-i;

            char frontChar = sb.charAt(frontIndex);
            char endChar = sb.charAt(endIndex);

            sb.setCharAt(frontIndex,endChar);
            sb.setCharAt(endIndex,frontChar);

        }
        System.out.println(sb);
    }
}
