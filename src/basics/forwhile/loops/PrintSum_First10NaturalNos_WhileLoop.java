package basics.forwhile.loops;

public class PrintSum_First10NaturalNos_WhileLoop {
    public static void main(String[] args) {
        int number = 10;
        int i =1;
        int sum =0;
        while(i<=10)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural numbers between 1 to 10 is: "+sum);
    }
}
