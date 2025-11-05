package practice.javaprograms.forloop;

public class Lab018_StarPattern {
    public static void main(String[] args) {
        //Use a nested for loop to print a star pattern (triangle)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
