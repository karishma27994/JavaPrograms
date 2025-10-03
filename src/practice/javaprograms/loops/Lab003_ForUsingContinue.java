package practice.javaprograms.loops;

public class Lab003_ForUsingContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5 || i ==7)
                continue; //It will skip and move to next iteration when statement becomes true.
            System.out.println(i);

        }
    }
}
