package practice.javaprograms;

import javax.swing.plaf.metal.MetalBorders;

public class Lab004_Ternary_RealAgeClassification {
    public static void main(String[] args) {
       /* under 18: Minor
       * 18 to 59: Adult
       * 60+: Senior Citizen or Senior Adult*/
        int age = 59;
        String result = age<18 ? "Minor" : ( age<=59 ? "Adult" : "Senior Citizen");
        System.out.println("Person age is\t"+age + "\tand is\t" + result);


    }
}
