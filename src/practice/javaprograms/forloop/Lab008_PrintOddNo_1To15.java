package practice.javaprograms.forloop;

public class Lab008_PrintOddNo_1To15 {
    public static void main(String[] args) {
        for (int i = 1; i <=15 ; i++) {
            if (i%2==0)
                continue;
            System.out.println("Odd number is: "+i);
        }}
}
