package src.main.java.com.michaelrichardhall.codewars;

//Simple Encryption #1 - Alternating Split
//Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.
//
//        Examples:
//
//        encrypt("012345", 1)  =>  "135024"
//        encrypt("012345", 2)  =>  "135024"  ->  "304152"
//        encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"
//
//        encrypt("01234", 1)  =>  "13024"
//        encrypt("01234", 2)  =>  "13024"  ->  "32104"
//        encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
//        Together with the encryption function, you should also implement a decryption function which reverses the process.
//
//        If the string S is an empty value or the integer N is not positive, return the first argument without changes.
//
//        This kata is part of the Simple Encryption Series:
//
//        Simple Encryption #1 - Alternating Split
//        Simple Encryption #2 - Index-Difference
//        Simple Encryption #3 - Turn The Bits Around
//        Simple Encryption #4 - Qwerty
//        Have fun coding it and please don't forget to vote and rank this kata! :-)

public class SimpleEncryption1AlternatingSplit {
    public static String encrypt(final String text, final int n) {
        if (text == null || text.length() == 0) {
            return text;
        }
        String encryptedText = text;
        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < encryptedText.length(); j++) {
                if (j % 2 != 0) {
                    sb.append(encryptedText.toCharArray()[j]);
                }
            }
            for (int j = 0; j < encryptedText.length(); j++) {
                if (j % 2 == 0) {
                    sb.append(encryptedText.toCharArray()[j]);
                }
            }
            encryptedText = sb.toString();
        }
        return encryptedText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.length() == 0) {
            return encryptedText;
        }
        String decryptedText = encryptedText;
        int length = decryptedText.length();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int evenIndex = 0;
            int oddIndex = length % 2 == 0 ? length / 2 : (length + 1)/ 2 - 1;

            for (int j = oddIndex; j < length; j++) {
                sb.append(decryptedText.toCharArray()[j]);
                if (evenIndex < oddIndex) {
                    sb.append(decryptedText.toCharArray()[evenIndex]);
                }
                evenIndex++;
            }
            decryptedText = sb.toString();
        }
        return decryptedText;
    }
}
