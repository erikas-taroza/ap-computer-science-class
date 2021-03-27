package Module14.Assignments.Caesar_Shift;

import java.util.*;

/**
 * This class handles message encryption
 *
 * @author Erikas Taroza
 * @version 02/18/21
 * @param alphabet = the alphabet the encryption uses
 */

public class Encryption {
    private static final List<String> alphabet = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

    // encrypts the given message using the given key
    public static String EncryptMessage(int key, String message) {
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            int letterIndex = alphabet.indexOf(message.substring(i, i + 1));

            if (0 <= letterIndex + key && letterIndex + key < 26) {
                encryptedMessage += alphabet.get(letterIndex + key);
            } else if (letterIndex + key >= 26) {
                encryptedMessage += alphabet.get((letterIndex + key) - 26);
            }
        }

        return encryptedMessage;
    }
}
