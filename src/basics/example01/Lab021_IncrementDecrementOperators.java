package basics.example01;

public class Lab021_IncrementDecrementOperators {
    public static void main(String[] args) {
        int a = 9;
        int result1 = ++a; //Pre increment - first increment by 1 then use it
        System.out.println(result1); //10
        System.out.println(a); //10

        int b = 9;
        int result2 = b++; //Post Increment - first use it and then increment by 1
        System.out.println(result2); //9
        System.out.println(b); //10

        int c = 9;
        int result3 = --c; //Pre decrement - first decrement by 1 then use it
        System.out.println(result3); //8
        System.out.println(c); //8

        int d = 9;
        int result4 = d--; //Post Decrement - first use it and then decrement by 1
        System.out.println(result4); //9
        System.out.println(d); //8
    }
}
