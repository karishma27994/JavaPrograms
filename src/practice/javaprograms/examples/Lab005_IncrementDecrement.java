package practice.javaprograms;

public class Lab005_IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++); //5
        System.out.println(a); //6

        int b = 10;
        System.out.println(++b); //11
        System.out.println(b); //11

        int x = 5;
        int y = x++ + ++x; //5 + 7
        System.out.println(y); // 12
        System.out.println(x); // 7

        int p = 7;
        int q = p-- - --p; //7 - 5
        System.out.println(q); // 2
        System.out.println(p); // 5

        int i = 1;
        int result = i++ + i++ + ++i + --i;  //1 + 2 + 4 + 3
        System.out.println(result); // 10
        System.out.println(i); // 3

        int c = 2, d = 3;
        int res = ++c * d++ + c-- * --d; //3 * 3 + 3 * 3
        System.out.println(res); // 18
        System.out.println(c); // 2
        System.out.println(d); // 3

    }
}
