package Module14.Assignments.Caesar_Shift;

import java.util.*;

/**
 * This class handles message encryption
 *
 * @author Erikas Taroza
 * @version 02/18/21
 * @param alphabet = the alphabet the decryption uses
 */

public class Decryption {
    private static final List<String> alphabet = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

    // decrypts the given message using the given key
    public static String DecryptMessage(int key, String encryptedMessage) {
        String originalMessage = "";

        for (int i = 0; i < encryptedMessage.length(); i++) {
            int letterIndex = alphabet.indexOf(encryptedMessage.substring(i, i + 1));

            if (0 <= letterIndex - key && letterIndex - key < 26) {
                originalMessage += alphabet.get(letterIndex - key);
            } else if (letterIndex - key < 0) {
                originalMessage += alphabet.get((letterIndex - key) + 26);
            }
        }

        return originalMessage;
    }
}
