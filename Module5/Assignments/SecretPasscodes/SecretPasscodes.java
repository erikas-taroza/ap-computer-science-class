package Module5.Assignments.SecretPasscodes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscodes {
    /*
        Erikas Taroza
        10/06/20
        This program generates password based on user input until the user stops the program.
    */

    public static void main(String[] args) throws IOException {
        // variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int selection = 0;
        int length = 0;
        String password = "";

        File filePath = new File("Module5/Assignments/SecretPasscodes/password.txt");
        PrintWriter pw = new PrintWriter(filePath);
        Scanner read = new Scanner(filePath);

        while (selection != 5) {
            // reset password
            password = "";
            // request information
            System.out.println("                Password Generator Menu                ");
            System.out.println("*******************************************************");
            System.out.println("[1] Letters");
            System.out.println("[2] Letters and symbols");
            System.out.println("[3] Letters and numbers");
            System.out.println("[4] Letters and numbers and symbols");
            System.out.println("[5] Quit");
            System.out.println("*******************************************************");

            System.out.print("Enter selection (1-5): ");
            selection = scanner.nextInt();
            System.out.println();

            // check if the selection is quit. if it isn't, continue generating
            if (selection == 5) {
                // close scanners and create file, read, close reader.
                scanner.close();
                pw.close();

                System.out.println();
                System.out.println("Generated passwords: ");
                while (read.hasNext()) {
                    System.out.println(read.nextLine());
                }
                read.close();
            } else {
                // if the selection is invalid, ask for it again
                while (selection > 5) {
                    System.out.println("Please enter a valid number.");
                    System.out.print("Enter selection (1-5): ");
                    selection = scanner.nextInt();
                    System.out.println();
                }

                // get password length
                System.out.print("Password length (6+): ");
                length = scanner.nextInt();

                // if the length is less than 6, ask for a different length
                while (length < 6) {

                    System.out.println("Password length is too low. Please try again.");
                    System.out.print("Password length (6+): ");
                    length = scanner.nextInt();
                }

                // letters
                if (selection == 1) {

                    while (password.length() < length && length >= 6) {
                        int number = random.nextInt(126);
                        if ((number >= 97 && number <= 122) || (number >= 65 && number <= 90)) {
                            password += Character.toString((char) number);
                        }
                    }
                    pw.println(password);
                    // letters and symbols
                } else if (selection == 2) {

                    while (password.length() < length && length >= 6) {
                        int number = random.nextInt(126);
                        if ((number >= 97 && number <= 122) || (number >= 65 && number <= 90)
                                || (number >= 33 && number <= 47) || (number >= 58 && number <= 64)
                                || (number >= 91 && number <= 96) || (number >= 123 && number <= 126)) {
                            password += Character.toString((char) number);
                        }
                    }
                    pw.println(password);
                    // letters and numbers
                } else if (selection == 3) {

                    while (password.length() < length && length >= 6) {
                        int number = random.nextInt(126);
                        if ((number >= 97 && number <= 122) || (number >= 65 && number <= 90)
                                || (number >= 48 && number <= 57)) {
                            password += Character.toString((char) number);
                        }
                    }
                    pw.println(password);
                    // letters and symbols and numbers
                } else if (selection == 4) {

                    while (password.length() < length && length >= 6) {
                        int number = random.nextInt(126);
                        if ((number >= 97 && number <= 122) || (number >= 65 && number <= 90)
                                || (number >= 48 && number <= 57) || (number >= 33 && number <= 47)
                                || (number >= 58 && number <= 64) || (number >= 91 && number <= 96)
                                || (number >= 123 && number <= 126)) {
                            password += Character.toString((char) number);
                        }
                    }
                    pw.println(password);
                }
            }
        }
    }
}
