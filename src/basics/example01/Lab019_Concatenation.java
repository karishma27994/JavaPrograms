package basics.example01;

public class Lab019_Concatenation {
    public static void main(String[] args) {
        int a =10, b=20;
        String s1 = "Hello";
        String s2 = "World";

        //When used with numbers it will add the numbers and provide the result
        System.out.println(a+b);

        //When used with Strings it will join/combine the strings and provide the result
        System.out.println(s1+s2);

        /*When numbers and Strings are mixed, Java evaluates from left to right.
        In simple terms if String comes first, everything after will also turn into a String unless parenthesis are used
        Parentheses will force whatever is inside them to be evaluated first, before seeing the left/right order.*/

        System.out.println(s1+s2+a+b);
        System.out.println(a+b+s1+s2);
        System.out.println(s1+a+b+s2);
        System.out.println(s1+s2+(a+b));
        System.out.println(s1+(a+b)+s2);
        System.out.printf("%s%s%d",s1,s2,a+b);
    }
}
