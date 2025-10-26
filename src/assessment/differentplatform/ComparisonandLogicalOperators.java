package assessment.differentplatform;

public class ComparisonandLogicalOperators {
    public static void main(String[] args) {
    /* Sample input and output
    I/p: 10, 5
    O/p- a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false*/

        //Comparison operators (==, !=, <, >, <=, >=). It compares and returns the output as boolean
        byte a = 10, b = 5;
        System.out.println("a==b: " + (a == b));
        System.out.println("a<b: " + (a < b));
        System.out.println("a>b: " + (a > b));
        System.out.println("a<=b: " + (a <= b));
        System.out.println("a>=b: " + (a >= b));
        System.out.println("a!=b: " + (a != b));

        //Logical operators (&&, ||, !). It compares 2 boolean expressions and return output as boolean
        boolean bol1 = true, bol2 = false;
        boolean cond1 = a<b;
        boolean cond2 = a!=b;
        System.out.println("bol1&&bol2: " + (bol1&&bol2));
        System.out.println("cond1||cond2: " + (cond1&&cond2));
        System.out.println("!cond1: " + (!cond1));
    }
}
