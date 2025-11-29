package basics.strings;

import java.util.Arrays;

public class Lab016_StringMethods {
    public static void main(String[] args) {
        String str1 = new String("Java Programming");
        String str2 = new String("String MethodS");
        String str3 = "java programming";
        String str4 = "String MethodS";
        String str5 = "  Java:     Java     ";
        String str6 = "";
        String str7 = "\u2002Hello\u2002";
        String str8 = "Learning: Java: is: a fun";
        String str9 = "Learning ** regex**";
        //length(): Used to calculate length of string. Output: int
        System.out.println("String length");
        System.out.println(str1.length());
        System.out.println(str3.length());
        //charAt(): Returns character at the index provided. Output is char
        System.out.println("Print character at provided index");
        System.out.println(str1.charAt(5));
        //indexOf(): Returns the first index of the character from provided string. Output is int
        System.out.println("Print first index of provided string");
        System.out.println( str1.indexOf('a'));
        System.out.println("PythonTest".indexOf('t'));
        //lastIndexOf(): Returns the last occurence/index of the character from provided string. Output is int
        System.out.println("Print last index of provided string");
        System.out.println(str2.lastIndexOf('S'));
        System.out.println("StStrings".lastIndexOf('S'));
        //equals(): Compares the 2 string(Case-sensitive comparision). Output: boolean
        System.out.println("Print 2 string equal or not with case sensitivity");
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));
        //equalsIgnoreCase(): compares 2 strings ignores case sensitivity. Output: boolean
        System.out.println("Print 2 string equal or not without case sensitivity");
        System.out.println(str1.equalsIgnoreCase(str3));
        //compareTo(): compares 2 strings on basis of ASCII value. Output: int
        System.out.println("Compares 2 strings on basis of AsCII value with case sensitivity");
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str2));
        //compareToIgnoreCase(): compares 2 strings on basis of ASCII value but ignores case sensitivity. Output: int
        System.out.println("Compares 2 strings on basis of AsCII value without case sensitivity");
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str2.compareToIgnoreCase(str3));
        //toUpperCase: Converts the string to uppercase. Output: String
        System.out.println("converts string to Uppercase");
        System.out.println(str3.toUpperCase());
        //toLowerCase: Converts the string to lowercase. Output: String
        System.out.println("converts string to lowercase");
        System.out.println(str2.toLowerCase());
        //substring(): extracts the string as per the start and ending index. Output: string
        System.out.println("Prints the substring of the complete string");
        System.out.println(str1.substring(3)); //returns the substring from the start index and until the end
        System.out.println(str4.substring(2,8)); //returns the substring from the start index and end index-1
        //subSequence(): //returns the substring from the start index and end index-1(same as substring()). Output: CharSequence
        System.out.println("Prints the substring of the complete string but returns CharSequence");
        System.out.println(str4.subSequence(2,8));
        //replace(): replaces the old character/string with the new character/string: Output: String
        System.out.println("Replaces old char/string with the new");
        System.out.println(str1.replace('a','b')); //returns string replacing old char with new char
        //replaceAll(): Uses regex/patterns and replaces the value. However, it can provide output with strings as well. Output: String
        System.out.println(str3.replaceAll("java","python")); //returns string replacing old string with new string
        System.out.println(str3.replaceAll("-","java")); //"-" pattern not found so return the string as is
        System.out.println(str5.replaceAll(":","-"));
        System.out.println(str9.replaceAll("\\*"," "));
        System.out.println(str5.replaceFirst("Java","python"));//returns string replacing only first matching string with the new string
        //trim(): removes the leading and trailing whitespaces(only ASCII whitespace). Output: string
        System.out.println("Removes the leading and trailing whitespaces(only ASCII whitespace) and print output");
        System.out.println(str5.trim());
        System.out.println(str7.trim());
        //strip(): removes the leading and trailing whitespaces(Unicode-aware whitespace). Output: string
        System.out.println("Removes the leading and trailing whitespaces(Unicode-aware whitespace) and print output");
        System.out.println(str5.strip());
        System.out.println(str7.strip());
        //split()
        System.out.println("splits the string into String array on basis of the expression provided");
        String strarray[] = str8.split(":");
        for (int i = 0; i <strarray.length ; i++) {
            System.out.println(strarray[i].trim());
        }
        //join(): joins the string using delimiters. Output: string
        System.out.println("Joins multiple strings and print result");
        System.out.println(String.join("-", str1, str2, str3));

        //isEmpty(): checks if string is Empty(length=0) or not and return true or false. Output: boolean
        System.out.println("Checks if string is empty");
        System.out.println(str5.isEmpty());
        System.out.println(str6.isEmpty());
        //isBlank(): Checks if string is empty or only whitespace and return true or false. Output: boolean
        System.out.println("Checks if string is empty or only whitespace");
        System.out.println(str6.isBlank());
        //contains(): checks if substring provided is present(case sensitive) and returns true or false. Output: boolean
        System.out.println("Checks if string contains the provided string");
        System.out.println(str1.contains("av"));
        System.out.println(str2.contains("s"));
        System.out.println(str1.contains("p"));
        //startsWith(): checks if the string starts with(prefix) the provided string and returns true or false. Output: boolean
        System.out.println("Checks if string starts with the provided string or the index");
        System.out.println(str1.startsWith("a"));
        System.out.println(str1.startsWith("J"));
        System.out.println(str1.startsWith("a",1));
        System.out.println(str1.startsWith("J",1));
        //endsWith(): checks if the string ends with(suffix) the provided string and returns true or false. Output: boolean
        System.out.println("Checks if string ends with the provided string");
        System.out.println(str2.endsWith("t"));
        System.out.println(str2.endsWith("S"));
        //toCharArray(): converts string to character array: Output: Character array
        System.out.println("Converts string to character array");
        char ch[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch));

        //valueOF(): converts any primitive type to strings. Output: String
        int num=10;
        System.out.println(String.valueOf(num));

    }

    }

