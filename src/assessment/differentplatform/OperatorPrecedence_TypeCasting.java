package assessment.differentplatform;

public class OperatorPrecedence_TypeCasting {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        //Operator precedence
        int exp = (a++ + ++b * (c-- + a) / b);
        //exp = (2 + 4 * (4 + 3)/4) = 9
        System.out.println(exp);
        int result = exp > 10 ? (a + b + c) : (a * b * c);
        System.out.println(result);

        //Type Casting
        byte by = 120;
        int expcast = by;
        System.out.println(expcast);

        double d = 3.144444444444444444444;
        float impcast = (float) d;
        System.out.println(impcast);

        //Operator and type casting
        int num1 = 10;
        float num2 =3.5f;
        double resultexpcast = num1 +num2;
        int resultimpcast = num1 + (int)num2;
        System.out.println(resultexpcast);
        System.out.println(resultimpcast);

    }
}
