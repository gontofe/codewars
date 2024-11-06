package src.main.java.com.michaelrichardhall.codewars;

/*
Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway
 */
public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        if (n > 0) {
            String stringN = String.valueOf(i);
            if (stringN.charAt(stringN.length() - 1) == '0') {
                stringN = stringN.substring(0, stringN.length() - 1);
                return Integer.parseInt(stringN);
            }
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        noBoringZeros(1450);
    }
}
