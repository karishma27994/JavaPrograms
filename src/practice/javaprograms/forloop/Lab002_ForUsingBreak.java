package practice.javaprograms.forloop;

public class Lab002_ForUsingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i == 5)
                break; //It will come out of the loop when the condition satisfies
            System.out.println(i);

        }
    }
}
