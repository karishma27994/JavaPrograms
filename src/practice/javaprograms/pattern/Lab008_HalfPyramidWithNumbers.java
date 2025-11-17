package practice.javaprograms.pattern;

public class Lab008_HalfPyramidWithNumbers {
    /*
    0
    01
    012
    0123
    01234
    012345
     */
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
