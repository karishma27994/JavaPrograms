package basics.strings;

import java.util.Scanner;

public class Lab015_UsernameUsingEmail {
   /* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    Example : email = “helloWorld123@gmail.com”; username = “helloWorld123”*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an email address");
        String emailAddress = sc.nextLine();
        String userName = "";
        for (int i = 0; i < emailAddress.length(); i++) {
            if (emailAddress.charAt(i) == '@') {
                break;
            }
            else
            {
                userName +=emailAddress.charAt(i);
            }
        }
        System.out.println("Username: " + userName);
    }
}
