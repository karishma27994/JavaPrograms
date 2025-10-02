package practice.javaprograms.ifelse_switch;

import java.util.Scanner;

public class Lab002_Vowels_IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        if (sc.hasNext()) {
            String str = sc.next().toLowerCase();

            if (str.length() == 1) {
                char ch = str.charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.println("Character is a vowel: " + ch);
                else System.out.println("Character is not a vowel");

            } else {
                boolean flag = false;
                for (int i = 0; i < str.length(); i++) {
                    char strCh = str.charAt(i);
                    if (strCh == 'a' || strCh == 'e' || strCh == 'i' || strCh == 'o' || strCh == 'u')
                        System.out.println("Character is a vowel: " + strCh);
                }
                if (!flag)
                    System.out.println("No vowels present");

            }

        }

    }

}

