package basics.strings;

public class Lab007_StringEquals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s3 = "JAVA";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s3));
    }
}
