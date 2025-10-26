package assessment.differentplatform;

public class Arithmetic_AssignmentOperators {
    public static void main(String[] args) {
        /* Sample input and output
        I/p: 10, 5
        O/p: Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0*/

        int a = 10, b =5;
        //Use +, -, *, /, % operators
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));

        //assignment operators (=, +=, -=, *=, /=)
        float f = 3.14F;
        System.out.println("Demonstrating +=: " + (f+=2));
        System.out.println("Demonstrating -=: " + (f-=3));
        System.out.println("Demonstrating +=: " + (f*=4));
        System.out.println("Demonstrating /=: " + (f/=5));

    }
}
