package practice.javaprograms;

public class Lab003_Ternary_EvenOdd {
    public static void main(String[] args) {
        int number = 10;
        String result = (number%2==0) ? "Even number" : "Odd number";
        System.out.println("Result is " + result + " and number is " + number);
        System.out.printf("Result is %s and number is %d", result, number); //formatted way
    }
}
