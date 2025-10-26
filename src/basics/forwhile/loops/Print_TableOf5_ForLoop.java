package basics.forwhile.loops;

public class Print_TableOf5_ForLoop {
    public static void main(String[] args) {
        int table =5, mul =1;
        for (int i = 1; i <=10 ; i++) {
           mul = table * i;
            System.out.printf("%d*%d=%d\n", table, i, mul);
        }
    }
}
