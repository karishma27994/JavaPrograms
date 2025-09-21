package basics.example01;

public class Lab015_CompoundAssignmentOperators {
    public static void main(String[] args) {
        int a = 2;
        a +=10; //it means a= a+10
        System.out.println(a);
        a -=10; //it means a= a-10
        System.out.println(a);
        a *=10; //it means a= a*10
        System.out.println(a);
        a /=10; //it means a= a/10
        System.out.println(a);
        a %=10; //it means a= a%10
        System.out.println(a);

        float f = 3.14f;
        double d = 3.1555;
        f +=10.1f; //it means f= f+10
        System.out.println(f);
        d -=10; //it means d= d-10
        System.out.println(d);
        f *=10; //it means f= f*10
        System.out.println(f);
        d /=10; //it means d= d/10
        System.out.println(d);
        f %=10; //it means f= f%10
        System.out.println(f);

        char c = 'A';
        c +=10; //it means c= c+10
        System.out.printf("Character is = %c and number corresponding to it is %d",c,(int) c).println();
        c -=10; //it means c= c-10
        System.out.printf("Character is = %c and number corresponding to it is %d%n",c,(int) c);
        c *=10; //it means c= c*10
        System.out.printf("Character is = %c and number corresponding to it is %d",c,(int) c).println();
        c /=10; //it means c= c/10
        System.out.printf("Character is = %c and number corresponding to it is %d\n",c,(int) c);
        c %=10; //it means c= c%10
        System.out.printf("Character is = %c and number corresponding to it is %d\n",c,(int) c);

        //For character we are printing the output as the character and the integer value corresponding to that character

        String s = "Java";
        s += "\tProgramming";
        System.out.println(s); //With Strings only += operator works which means concatenation (joining text)


    }
}
