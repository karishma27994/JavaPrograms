package practice.javaprograms;

public class Lab002_Ternary_Maxof3 {
    public static void main(String[] args) {
        int n1 = 2; int n2 = 9;  int n3 = -11;
        int result = (n1>n2 && n1>n3) ? n1 : (n2>n3 ? n2 : n3);
        System.out.printf("Maximum no is: %d", result);

    }
}
