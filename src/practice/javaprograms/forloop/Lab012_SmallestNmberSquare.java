package practice.javaprograms.forloop;

public class Lab012_SmallestNmberSquare {
   // Find the smallest number that when squared is greater than 1000.
   public static void main(String[] args) {
       for (int i = 0; ; i++) {
           if(i*i > 1000)
           {
               System.out.printf("Smallest number %d when squared is greater than 1000",i);
               break;
           }
       }
   }
}
