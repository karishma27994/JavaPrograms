package practice.javaprograms.forloop;

public class Lab015_NumberDivisibleBy3Or5 {
    //Find all numbers between 1 and 50 that are divisible by 3 or 5, but not both.
    public static void main(String[] args) {
        for (int i = 1; i <=50; i++) {
            if((i%3 ==0) && (i%5==0) )
            {
                continue;
            } else if (i%3 ==0)
            {
                System.out.println("Number divisible by 3 is: "+i);
            } else if (i%5==0) {
                System.out.println("Number divisible by 5 is: "+i);
            }


        }
    }
}
