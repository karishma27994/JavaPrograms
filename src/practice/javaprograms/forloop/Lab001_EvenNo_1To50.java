package practice.javaprograms.forloop;

public class Lab001_EvenNo_1To50 {
    public static void main(String[] args) {
        for (int i = 1; i<=50 ; i++) {
            if(i%2 == 0)
                System.out.println("No is even: " + i);
            else System.out.println("No is odd: " + i);
        }
    }
}
