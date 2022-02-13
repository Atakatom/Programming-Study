package Java101;

import java.util.Scanner;

//practice of https://app.patika.dev/moduller/java101/pratik-hesap-mak-1

public class Calculator {
    public static void main(String[] args) {
        String[] options = {"Sum","Subtract","Multiply","Divide"};
        var scan = new Scanner(System.in);
    
        System.out.print("Enter the first number : ");
        int n1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int n2 = scan.nextInt();

        for(int i = 0; i < options.length; i++){
            System.out.println(i+1 + " - "+options[i]);
        }
        System.out.print("Your choice : ");
        int choice = scan.nextInt();

        scan.close();
        
        switch(choice){
            case 1:
                System.out.println(options[choice-1]+" : "+ (n1 + n2));
                break;
            case 2:
                System.out.println(options[choice-1]+" : "+ (n1 - n2));
                break;
            case 3:
                System.out.println(options[choice-1]+" : "+ (n1 * n2));
                break;
            case 4:
                System.out.println( (n2==0) ? "You cannot divide with zero" : (options[choice-1]+" : "+(n1/n2)));
                break;
            default:
                System.out.println("Wrong choice. Try again later..");
        }

    }
    
}
