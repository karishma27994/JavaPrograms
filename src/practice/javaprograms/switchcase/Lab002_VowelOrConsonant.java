package practice.javaprograms.switchcase;

import java.util.Scanner;

public class Lab002_VowelOrConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
            String str = sc.nextLine();
            for(int i =0; i<str.length();i++)
            {
                char ch = str.charAt(i);
              if(Character.isLetter(ch))
              {
                  ch = Character.toLowerCase(ch);
                  switch(ch)
                  {
                      case 'a':
                      case 'e':
                      case 'i':
                      case 'o':
                      case 'u':
                          System.out.println("Characters is vowel: " + ch);
                      default:
                          System.out.println("Characters is consonant: " + ch);
                  }
              }
              else
              {
                  System.out.println("Ignore the character: " +ch);
              }
              sc.close();
            }

                }
            }


