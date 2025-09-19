package basics.example01;

public class Lab006_Primitive_Data_Types {
    public static void main(String[] args) {
        byte b1 = -128, b2=127;
        System.out.println("byte size:" + b1 +"\t"+ b2);
        short s1 = -32768, s2 = 32767;
        System.out.println("short size:" + s1 +"\t"+ s2);
        int i = 1234567890;
        /*simple terms if number has more than 10 digits, it probably won't fit in int so we need to use long instead.
        Please note this comment is just for an understanding. In real Java doesn't count digits - it checks if the actual value fits within the range.*/
        System.out.println(i);
        long l = 1234567891234567891L;
        /*simple terms if number has more than 19 digits, it probably won't fit in long.
        Please note this comment is just for an understanding. In real Java doesn't count digits - it checks if the actual value fits within the range.*/
        System.out.println(l);
        char c1='A', c2 ='a', c3=':', c4='水'; //Unicode characters 0 to 65,535
        System.out.println("Character stores letters&symbols however internally it stores it as Unicode numbers:" +c1 +'\t'+c2+'\t'+c3+'\t'+c4);
        float f = 311.12345678912345678912345678912345678912345678911111111111111111111111111111111111111111111111111111111111111111111f;
        System.out.println("Float stores approx 6-7 significant digits of precision:"+f);
        double d = 311.12345678912345678912345678912345678912345678911111111111111111111111111111111111111111111111111111111111111111111;
        System.out.println("Double stores approx 15-17 significant digits of precision:"+d);
        boolean bol1 = true, bol2 = false;
        System.out.println("Boolean stores only 2 values either true or false:"+bol1+'\t'+bol2);

    }
}
