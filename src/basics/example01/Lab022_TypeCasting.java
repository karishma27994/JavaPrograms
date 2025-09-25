package basics.example01;

public class Lab022_TypeCasting {
    public static void main(String[] args) {
       byte a =100;
       int  b = a ; //When we need to assign lower data type value to bigger type then we use implicit type casting. It is done automatically.
        System.out.println(b);

        double d = 3.1444123456789123;
        System.out.println(d);
        // float f = d; Here we will get error as we are trying implicit casting on larger type to smaller type
        float f = (float) d; //When we need to assign bigger data type value to smaller type then we use explicit type casting. It is done manually.
        System.out.println(f);


    }
}
