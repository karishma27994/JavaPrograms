package basics.example01;

public class Lab025_IfElseIf_Condition {
    public static void main(String[] args) {
        String userInput = args[0]; //USer input taken using CLI Option
        int age = Integer.parseInt(userInput);
        if(age>20)
            System.out.println("Age>20: " + age);
        else if (age<20)
            System.out.println("Age<20: " + age);
        else System.out.println(age);
    }
}
