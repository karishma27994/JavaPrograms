package basics.strings;
import java.util.*;
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
public class Lab013_StringArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        String str[] = new String[size];
        int length = 0;
        //Input elements in an array and calculate the cumulative length of the String inputted
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
            length += str[i].length();
        }
        //Print cumulative length
        System.out.println(length);
    }
}
