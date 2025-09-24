package basics.example01;

public class Lab020_Character {
    public static void main(String[] args) {
        char c1 = 'A', c2='%';
        short s = 12;
        System.out.println(c1+c2); // When used with arithmetic operators, it becomes an int.
        System.out.println(c1 +=10); //When used with Compound assignment operators, it automatically cast it to char
        System.out.println(s+c2);
    }
}
