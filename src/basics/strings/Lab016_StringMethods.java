package basics.strings;

public class Lab016_StringMethods {
    public static void main(String[] args) {
        String str1 = new String("Java Programming");
        String str2 = new String("String MethodS");
        String str3 = "java programming";
        String str4 = "String MethodS";
        //length(): Used to calculate length of string. Output: int
        System.out.println(str1.length());
        System.out.println(str3.length());
        //charAt(): Returns character at the index provided. Output is char
        System.out.println(str1.charAt(5));
        //indexOf(): Returns the first index of the character from provided string. Output is int
        System.out.println( str1.indexOf('a'));
        System.out.println("PythonTest".indexOf('t'));
        //lastIndexOf(): Returns the last occurence/index of the character from provided string. Output is int
        System.out.println(str3.lastIndexOf('S'));
        System.out.println("StStrings".lastIndexOf('S'));
        //equals(): Compares the 2 string(Case-sensitive comparision). Output: boolean
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));
        //equalsIgnoreCase(): compares 2 strings ignores case sensitivity. Output: boolean
        System.out.println(str1.equalsIgnoreCase(str3));
        //compareTo(): compares 2 strings on basis of ASCII value. Output: int
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str2));
        //compareToIgnoreCase(): compares 2 strings on basis of ASCII value but ignores case sensitivity. Output: int
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str2.compareToIgnoreCase(str3));
        //toUpperCase: Converts the string to uppercase. Output: String
        System.out.println(str3.toUpperCase());
        //toLowerCase: Converts the string to lowercase. Output: String
        System.out.println(str2.toLowerCase());

    }
}
