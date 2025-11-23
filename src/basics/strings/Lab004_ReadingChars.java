package basics.strings;

public class Lab004_ReadingChars {
    public static void main(String[] args) {
        String s1 = new String("Java Programming");
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            System.out.println(ch);
        }
    }
}
