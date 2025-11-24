package basics.strings;

public class Lab006_StringEquality {
    public static void main(String[] args) {
        //== checks the memory address
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Java";
        String s4 = new String("java");
        String s5 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);
        System.out.println(s3 == s5);

    }
}
