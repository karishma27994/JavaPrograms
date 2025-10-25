package programs.java;

import java.util.Scanner;

public class CharacterVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

            for (int i =0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                if(Character.isLetter(ch))
                {
                    ch = Character.toLowerCase(ch);
                    if(ch =='a'||ch == 'e'|| ch == 'i'|| ch =='o' || ch =='u')
                        System.out.println("Character is vowel: " + ch);
                    else System.out.println("Character is consonant: " + ch);
                }
                else
                    System.out.printf("Ignoring character %c as its not a letter\n", ch);

            }
            sc.close();
        }
        }


