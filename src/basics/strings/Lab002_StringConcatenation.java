package basics.strings;

public class Lab002_StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("World");

        System.out.println(s1+ " " + s2);
        System.out.println(s1.concat(s2));
    }
}
