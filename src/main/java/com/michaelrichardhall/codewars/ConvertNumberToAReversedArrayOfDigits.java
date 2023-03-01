package src.main.java.com.michaelrichardhall.codewars;

// Convert number to reversed array of digits
//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//        Example(Input => Output):
//        35231 => [1,3,2,5,3]
//        0 => [0]

public class ConvertNumberToAReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }
}
