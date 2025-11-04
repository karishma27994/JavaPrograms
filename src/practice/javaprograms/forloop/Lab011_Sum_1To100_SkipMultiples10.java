package practice.javaprograms.forloop;

public class Lab011_Sum_1To100_SkipMultiples10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%10==0)
            {
                System.out.printf("Number %d is multiple of 10 so its skipped\n", i);
                continue;
            }
            else
            {
                sum +=i;
            }

        }
        System.out.println("Sum of all numbers between 1 to 100(skipped multiples of 10) is: " +sum);
    }
}
