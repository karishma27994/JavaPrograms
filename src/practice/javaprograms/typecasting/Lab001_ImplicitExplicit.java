package practice.javaprograms.typecasting;

public class Lab001_ImplicitExplicit {
    public static void main(String[] args) {
        //Convert an int to a double and print the result
        int a1 =10;
        double a2 = a1;
        System.out.println(a2);

        //Convert float to int and observe the decimal part
        float f1 = 3.144f;
        int f2= (int)f1;
        System.out.println(f2);

        //Store the value in int and cast it into a byte
        int b1 = 300;
        byte b2 = (byte)b1;
        System.out.println(b2);

        //Convert char to its integer value
        char c1 = 'A';
        int c2 = (int) c1;
        System.out.println(c2);

        //Convert integer value into a char and print the character.
        int d1 = 97;
        char d2 = (char) d1;
        System.out.println(d2);
    }
}
