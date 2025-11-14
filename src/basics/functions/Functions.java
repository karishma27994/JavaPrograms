package basics.functions;

public class Functions {

    //Without parameters and returntype
    static void withoutparmsandreturntype()
    {
        System.out.println("This is the function type of without parameters and returntype");
    }

    //Without parameters but with returntype
    static String withoutparms_withreturntype()
    {
        System.out.println("This is the function type of without parameters but with returntype");
        return "Java";
    }

    //With parameters but no returntype
    static void withparms_noreturntype(int a, int b)
    {
        System.out.println("This is the function type of with parameters but no returntype");
        System.out.println(a+b);
    }

    //With parameters and returntype
    static int withparmsandreturntype(int a , int b)
    {
        System.out.println("This is the function type of with parameters and returntype");
        return a*b;
    }
    public static void main(String[] args) {
        withoutparmsandreturntype();
        String value = withoutparms_withreturntype();
        System.out.println("Value returned from the function is: " + value);
        withparms_noreturntype(3, 4);
        int result = withparmsandreturntype(3,4);
        System.out.println("Product of 2 nos returned from function is: " + result);


    }
}
