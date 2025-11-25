package basics.strings;

class StringClass {
    String name;
    public String toString()
    {
        return "name= " + "Java";
    }
}


public class Lab012_ToStringMethod {

    public static void main(String[] args) {
        StringClass s = new StringClass();
        System.out.println(s);
    }
}
