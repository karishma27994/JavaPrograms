package practice.javaprograms.userinput;

public class Lab001_CommandLineInput {
    public static void main(String[] args) {
    String userInputFirstName = args[0];
    String userInputLastName = args[1];
    String userInputAge = args[2];
    String userInputPhoneNumber = args[3];
    String userInputGrade = args[4];
    System.out.printf("User Details:%n%s%n%s%n%s%n%s%n\'%s\'", userInputFirstName, userInputLastName, userInputAge, userInputPhoneNumber, userInputGrade);
    }
}
