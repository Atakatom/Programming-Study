package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-atm

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        var inp = new Scanner(System.in);
        int right = 3;
        int price;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Enter the user name:");
            userName = inp.nextLine();
            System.out.print("Your password : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Patika Bank");
                do {
                    System.out.println("1-Add Money\n" +
                            "2-Take Money\n" +
                            "3-See the Amount\n" +
                            "4-Exit");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch(select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);

                inp.close();

                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}