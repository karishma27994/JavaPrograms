package practice.javaprograms.typecasting;

public class Lab002_ImplicitExplicit {
    public static void main(String[] args) {
        //Input a decimal number and print it as: int, float and long
        double d1 = 331.44789123456789123456789444566;
        int d2 = (int) d1;
        System.out.println(d2);
        float d3 = (float) d1;
        System.out.println(d3);
        long d4 = (long) d1;
        System.out.println(d4);

       //What happens if cast a long value 1_000_000_0000L into an int
        long l1 = 1_000_000_0000L;
        int l2 = (int) l1;
        System.out.println(l2);

        //Cast a negative byte value into a char.
        byte b1 = -127;
        char b2 = (char) b1;
        System.out.println("Character is: " +b2 + "number is: " + (int)b2);

        //Program takes a double 123.987 and prints integer part and fractional part (decimal part left after truncation).
        double dob1 = 123.987;
        int dob2 = (int) dob1;
        System.out.println(dob2);
        double fractional = dob1 - dob2;
        System.out.println(fractional);

        /*boolean b = true;
        int i = (int) b;
        This is not allowed as we can't type cast boolean data type*/

    }
}
