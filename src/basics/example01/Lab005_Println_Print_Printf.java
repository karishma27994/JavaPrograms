package basics.example01;

import java.sql.SQLOutput;

public class Lab005_Println_Print_Printf {
    public static void main(String[] args) {
       //println: Prints output and move to next line in console
        System.out.println("Hello123");

        //print: Prints output and stays on same line in console
        System.out.print("Hi");
        System.out.print("Bye\n");

        System.out.print("Hi\t"); //If we need space between Hi and Bye we can give extra space after "Hi" in print statement
        System.out.print("Bye\n");


        //printf: Printf means print formatted. Using specifiers(placeholders starting with %) we can print output in a nice formatted way.
       //to print integer numbers we use %d. Example as below:
        byte a = 1; short b = 2; int i =3; long l = 4L;
        System.out.printf("Printing a whole no which is of byte type: %d %n" , a);
        System.out.printf("Printing a whole no which is of short type: %d %n" , b);
        System.out.printf("Printing a whole no which is of int type: %d%n" , i);
        System.out.printf("Printing a whole no which is of long type: %d%n" , l);

        //to print floating numbers we use %f. Example as below:
        float f = 1.2222F; double d=3.144444444;
        System.out.printf("Printing a decimal no which is of float type: %f%n" , f);
        System.out.printf("Printing a decimal no which is of double type: %f%n" , d);

        //to print Strings we use %s. Example as below:
        String str = "Welcome to Java Programming";
        System.out.printf("Hello %s%n", str);

        //to print single character we use %c. Example as below:
        char c = 'o';
        System.out.printf("Hell%c%n", c);

        //to print boolean value we use %b. Example as below:
        System.out.printf("Is coding fun? %b%n", true);

        //to print % itself we use %%. Example as below:
        System.out.printf("Battery charged 90%%");

        //For new line we use %n which is used in all the examples shown above


    }
}
