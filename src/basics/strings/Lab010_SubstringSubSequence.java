package basics.strings;

public class Lab010_SubstringSubSequence {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.substring(3)); //Prints results from the beginindex till the endindex
        System.out.println(s.substring(2,10)); // Prints results from the beginindex till the endindex-1
        System.out.println(s.subSequence(4,10)); // Prints results from the beginindex till the endindex-1

        //substring() and subSequence() returns the same output but diference is substring returns String and subSequence() returns CharSequence
        String s1 = "Coding";
        String s2 = s1.substring(2,5);
        System.out.println(s2);
        CharSequence s3 = s1.subSequence(2,5);
        System.out.println(s3);
    }
}
