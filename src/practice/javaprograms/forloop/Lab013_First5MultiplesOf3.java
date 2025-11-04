package practice.javaprograms.forloop;

public class Lab013_First5MultiplesOf3 {
    //Print only the first 5 multiples of 3 between 1 and 100.
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (counter < 5)) {
                System.out.println("Multiple of 3 is: " + i);
                counter++;
            } else if (counter>5) {
                break;

            }

        }
    }
}
