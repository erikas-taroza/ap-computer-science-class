package Module3.Assignments;

import java.util.Scanner;

public class BuyVideoGames {
    /*
        Erikas Taroza
        09/17/20
        This program prints a receipt after make a purchase of a game
    */
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);

        String name;
        String date;
        String gameTitle;
        int copies;
        double price;
        String cardNumber;
        int pin;


        System.out.println("Please enter the following information: ");
        System.out.println();

        System.out.print("First and last name: ");
        name = scanner.nextLine();
        System.out.println();

        System.out.print("Date (mm/dd/yyyy): ");
        date = scanner.nextLine();
        System.out.println();
        
        System.out.print("Game title: ");
        gameTitle = scanner.nextLine();
        System.out.println();

        System.out.print("Price of game ($): ");
        price = scanner.nextDouble();
        System.out.println();

        System.out.print("Copies to buy: ");
        copies = scanner.nextInt();
        System.out.println();

        System.out.print("Debit card number (####-####-####-####): ");
        cardNumber = scanner.next();
        System.out.println();

        System.out.print("PIN: ");
        pin = scanner.nextInt();
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~RECEIPT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println(date);
        System.out.println("Order number: " + name.substring((int)(name.length() / 4), (int)(name.length() / 2)).toLowerCase().replaceAll("\s", "") + cardNumber.substring(5, 9) + cardNumber.substring(0, 4));
        System.out.println();

        System.out.println(name.substring(0, 1) + "." + name.substring(name.indexOf("\s")));
        System.out.println("Account: ####-####-####-##" + cardNumber.substring(cardNumber.length() - 2, cardNumber.length()));
        System.out.println("Game title: " + gameTitle);
        System.out.println("Copies: " + copies);
        System.out.println("Price: " + price);
        System.out.println("\n$" + (double)Math.round((price * copies) * 100) / 100 + " has been debited to your account.");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~HAVE FUN~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println(pin);

        scanner.close();
    }
}
