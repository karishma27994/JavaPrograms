package basics.strings;

public class Lab008_StringEqualsIgnore {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = new String("JAVA");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
