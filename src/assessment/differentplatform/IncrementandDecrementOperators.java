package assessment.differentplatform;

public class IncrementandDecrementOperators {
    public static void main(String[] args) {
        int inc = 5;
        System.out.println("Original value of inc: " + inc);
        int preinc = ++inc;//Pre-increment
        System.out.println("Pre-increment values");
        System.out.println("Value of inc after pre-increment: " +inc);
        System.out.println("Value of preinc after pre-increment: " +preinc);
        int postinc = inc++; //Post-increment
        System.out.println("Post-increment values");
        System.out.println("Value of inc after post-increment: " +inc);
        System.out.println("Value of postinc after post-increment: " +postinc);

        int dec = 5;
        System.out.println("Original value of dec: " + dec);
        int predec = --dec;//Pre-decrement
        System.out.println("Pre-decrement values");
        System.out.println("Value of dec after pre-decrement: " +dec);
        System.out.println("Value of predec after pre-decrement: " +predec);
        int postdec = dec--; //Post-decrement
        System.out.println("Post-decrement values");
        System.out.println("Value of dec after post-decrement: " +dec);
        System.out.println("Value of postdec after post-decrement: " +postdec);
    }
}
