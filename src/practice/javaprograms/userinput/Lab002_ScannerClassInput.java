package practice.javaprograms.userinput;

import java.util.Scanner;

public class Lab002_ScannerClassInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte IntegerByte = sc.nextByte();
        System.out.println(IntegerByte);
        int IntegerInt = sc.nextInt();
        System.out.println(IntegerByte);

    }
}
