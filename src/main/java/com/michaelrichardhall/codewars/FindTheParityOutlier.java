package src.main.java.com.michaelrichardhall.codewars;

//Find The Parity Outlier
//        You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
//
//        Examples
//        [2, 4, 0, 100, 4, 11, 2602, 36]
//        Should return: 11 (the only odd number)
//
//        [160, 3, 1719, 19, 11, 13, -21]
//        Should return: 160 (the only even number)

public class FindTheParityOutlier {
    static int find(int[] integers) {
        int numberEven = 0;
        boolean checkEven = false;

        for (int i = 0; i <= 2; i++) {
            if (Math.abs(integers[i]) % 2 == 0) {
                numberEven++;
            }
        }
        if (numberEven <= 1) {
            checkEven = true;
        }

        for (int i = 0; i < integers.length; i++) {
            boolean isEven = Math.abs(integers[i]) % 2 == 0;
            if (isEven == checkEven) {
                return integers[i];
            }
        }

        return 0;
    }
}
