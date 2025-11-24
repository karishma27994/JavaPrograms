package basics.strings;

public class Lab009_CompareEquals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("Same strings");
        }
        else {
            System.out.println("Not same strings");
        }
        if(new String("Coding") == new String("CODING"))
        {
            System.out.println("Same strings");
        }
        else {
            System.out.println("Not same strings");
        }
        if(s1 == new String("Java"))
        {
            System.out.println("Same strings");
        }
        else
        {
            System.out.println("Not same strings");
        }
        if(s1.equals(new String("Java")))
        {
            System.out.println("Same strings");
        }
        else
        {
            System.out.println("Not same strings");
        }
        if(s1.equalsIgnoreCase(new String("JAVA")))
        {
            System.out.println("Same strings");
        }
        else
        {
            System.out.println("Not same strings");
        }
        }
    }

