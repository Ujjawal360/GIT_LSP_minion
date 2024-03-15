package org.howard.edu.lsp.assignment4;

/**
 * A utility class for performing text encryption.
 */
public class SecurityOps {

    /**
     * Encrypts the given text by writing all of the even-index (starting at 0) characters,
     * followed by all of the odd index characters, ignoring punctuation and whitespace.
     *
     * @param text the text to be encrypted
     * @return the encrypted text
     */
    public static String encrypt(String text) {
        String newText = "";
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newText += c;
            }
        }

        String res1 = "";
        String res2 = "";
        for (int i = 0; i < newText.length(); i++) {
            if (i % 2 == 0) {
                res1 += newText.charAt(i);
            } else {
                res2 += newText.charAt(i);
            }
        }

        return res1 + res2;
    }
}

