package programs.typecasting;

public class Lab003_ImplicitExplicit {
    public static void main(String[] args) {
       //Program to print all characters from 'a' to 'z' along with their ASCII/Unicode values using type casting.
        for(char c ='a'; c<='z' ;c++)
        {
            System.out.println("Character is: "+c+" and Unicode value corresponding to it is:" + (int)c);
        }

        //Cast a very large double into an int.
        double d1 = 1e40;
        int d2 = (int)d1;
        System.out.println(d2);

        //Cast int into float, then back into an int.
        int i1 = 10;
        float i2 = i1;
        System.out.println(i2);
        int i3 = (int) i2;
        System.out.println(i3);

        //Casting a char like '字' (Chinese character) into an int.
        char ch1 = '字';
        int ch2 = (int) ch1;
        System.out.println(ch2);

        //Program to add two chars and print the numeric result and then cast back to char.
        char c1='A', c2='a';
        int sum = c1+c2;
        char sum1 = (char)sum;
        System.out.println("Sum of 2 chars is: "+sum+ " and char value of the sum is: "+sum1);
    }
}
