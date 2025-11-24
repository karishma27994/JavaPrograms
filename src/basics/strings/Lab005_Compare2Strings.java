package basics.strings;

public class Lab005_Compare2Strings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        String s5 = new String("Java");

        System.out.println(s1.compareTo(s2)); //Positive number as first string is smaller
        System.out.println(s2.compareTo(s1)); //Negative number as first string is larger
        System.out.println(s1.compareTo(s3)); //0 as s1 and s3 strings are equal
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.compareTo(s4));
        System.out.println(s4.compareTo(s5));

        System.out.println(s1.compareToIgnoreCase(s2)); //0 as s1 and s2 strings are equal as we are ignoring the case
    }
}
