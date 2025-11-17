package practice.javaprograms.pattern;

public class Lab013_SolidRhombus {
    /*
         *****
        *****
       *****
      *****
     *****
     */
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" "); //Printing spaces
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*"); //Printing stars
            }
            System.out.println();
        }
    }
}
