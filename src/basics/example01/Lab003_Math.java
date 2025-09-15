package basics.example01;

public class Lab003_Math {
    public static void main(String[] args) {
        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(5/2); //This gives quotient
        System.out.println(3%2); //This gives the remainder after integer division
        System.out.println("2+2"); //This will print 2+2 as is asa its mentioned withing double quotes and its treated as String
        System.out.println(4/1.5);
        /*Here 4 is an integer literal(int) and 1.5 is floating-point literal(double)
        When combined an int and a double in an arithmetic operation, Java promotes int to double. So result will be a double value*/

        System.out.println(1.555555467f/4);
        /*Here 1.555555467f is a floating point literal(float) and 4 is an integer literal(int)
        When combined float and int in an arithmetic operation, Java promotes int to float. So result will be a float value*/
    }
}
