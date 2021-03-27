package Module14.Assignments.Caesar_Shift;

import java.util.Scanner;

/**
 * This class handles inputs and displays outputs from the Encryption and
 * Decryption classes
 *
 * @author Erikas Taroza
 * @version 02/18/21
 */

public class CaesarTester {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String option = "";

            System.out.println("Caesar Encryption / Decryption");
            System.out.println("E - Encryption");
            System.out.println("D - Decryption");
            System.out.println();

            System.out.print("Select task: ");
            option = scanner.next().trim().toUpperCase();

            while (!option.equals("E") && !option.equals("D")) {
                System.out.println("Incorrect input. Try again.");
                System.out.print("Select task: ");
                option = scanner.next().trim().toUpperCase();
            }

            if (option.equals("E")) {
                HandleEncryption(scanner);
            } else if (option.equals("D")) {
                HandleDecryption(scanner);
            }
        }
    }

    private static void HandleEncryption(Scanner scanner) {
        int key = -1;
        String message = "";

        System.out.println();
        System.out.println("--- Encryption ---");
        System.out.println();

        System.out.print("Select encryption key (0 - 25): ");
        key = scanner.nextInt();

        while (key < 0 || key > 25) {
            System.out.println("Incorrect input. Try again.");
            System.out.print("Select encryption key (0 - 25): ");
            key = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Alphabet: " + alphabet);
        System.out.println("Cipher Alphabet: " + Encryption.EncryptMessage(key, alphabet));
        System.out.println();

        System.out.print("Enter message to encrypt: ");
        message = scanner.next();

        System.out.println();
        System.out.println("Encrypted Message: " + Encryption.EncryptMessage(key, message.trim().toLowerCase()));
        System.out.println();
    }

    private static void HandleDecryption(Scanner scanner) {
        int key = -1;
        String message = "";

        System.out.println();
        System.out.println("--- Decryption ---");
        System.out.println();

        System.out.print("Select encryption key (0 - 25): ");
        key = scanner.nextInt();

        while (key < 0 || key > 25) {
            System.out.println("Incorrect input. Try again.");
            System.out.print("Select encryption key (0 - 25): ");
            key = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Alphabet: " + alphabet);
        System.out.println("Cipher Alphabet: " + Encryption.EncryptMessage(key, alphabet));
        System.out.println();

        System.out.print("Enter message to decrypt: ");
        message = scanner.next();

        System.out.println();
        System.out.println("Decrypted Message: " + Decryption.DecryptMessage(key, message.trim().toLowerCase()));
        System.out.println();
    }
}
