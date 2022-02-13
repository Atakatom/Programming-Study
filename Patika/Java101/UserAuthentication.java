package Java101;

//Practice for https://app.patika.dev/moduller/java101/pratik-login-1

import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        String userName, password;

        var inp = new Scanner(System.in);

        System.out.print("Username is : ");
        userName = inp.nextLine();

        System.out.print("Password is : ");
        password = inp.nextLine();

        if(userName.equals("patika")){
            if(password.equals("java123")){
                System.out.println("You have entered the system.");
            } else {
                System.out.print("Your password is wrong would you change your password?(Y/n)");
                String choice = inp.nextLine().trim().toLowerCase();
                if(choice.equals("y")){
                    System.out.print("Enter the new password : ");
                    String newPassword = inp.nextLine().trim();
                    if(password.equals(newPassword)){
                        System.out.println("New password is not valid. Please enter another password !");
                    } else {
                        System.out.println("Password is changed.");
                    }
                }
            }
        } else {
            System.out.println("wrong UserName !");
        }

        inp.close();        
    }
}
