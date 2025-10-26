package basics.forwhile.loops;
import java.util.*;

public class Print_TableOf5_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which table needs to be printed");
        if(sc.hasNextShort())
        {
           short number = sc.nextShort();
           if(number<=0)
           {
               System.out.println("Enter a positive number");
           }
           else
           {
               short i = 1;
               int table = 1;
               while(i<=10)
               {
                   table = number * i;
                   System.out.printf("%d*%d=%d\n", number, i, table);
                   i++;
               }

           }
        }
        else
        {
            System.out.println("Enter a valid integer within short data type range");
        }
    }
}
