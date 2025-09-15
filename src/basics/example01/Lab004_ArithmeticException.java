package basics.example01;

public class Lab004_ArithmeticException {
    public static void main(String[] args) {
        //Only integer division or modulus by zero throws exception error.
        System.out.println(4/0); //java.lang.ArithmeticException
        System.out.println(4%0); //java.lang.ArithmeticException
        System.out.println(4L/0); //java.lang.ArithmeticException

        //Floating-point division by zero does not throw an exception. Instead it displays Infinity or NaN message in Console
        System.out.println(4F/0); //Infinity
        System.out.println(4f%0); //NaN(Not a number)
        System.out.println(0.0F/0); //NaN(Not a number)
        System.out.println(0.0F%0); //NaN(Not a number)
        System.out.println(-4F/0); //-Infinity
        System.out.println(-4f%0); //NaN(Not a number)
        System.out.println(-0.0F/0); //NaN(Not a number)
        System.out.println(-0.0F%0); //NaN(Not a number)
        System.out.println(4.1/0); //Infinity
        System.out.println(4.1%0); //NaN(Not a number)
        System.out.println(0.0/0); //NaN(Not a number)
        System.out.println(0.0%0); //NaN(Not a number)
        System.out.println(-4.1/0); //-Infinity
        System.out.println(-4.1%0); //NaN(Not a number)
        System.out.println(-0.0/0); //NaN(Not a number)
        System.out.println(-0.0%0); //NaN(Not a number)

    }
}
