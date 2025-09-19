package basics.example01;

public class Lab013_LogicalOperators {
    public static void main(String[] args) {
        int a = 3, b = 2, c=10, d=20;
        System.out.println((a<b)||(a>d));
        System.out.println((a==b)&&(c<d));
        System.out.println(!(a<=b));

        /*Logical operator-Used with true/false values (It is used with relational operators and returns as true or false)
        ||: compares 2 values and returns true only if both are true.
        &&: compares 2 values and returns true even if one is true.
        !: negates the value*/
    }
}
