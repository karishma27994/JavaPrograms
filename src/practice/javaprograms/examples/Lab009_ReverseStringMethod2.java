package practice.javaprograms.examples;
import java.util.Scanner;

public class Lab009_ReverseStringMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string that needs to be reversed");
        String str = sc.nextLine().replaceAll("\\s+", "");
        String reverse = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >=0 ; i--) {
            reverse=reverse + ch[i];
        }
        System.out.println(reverse);
    }
}
