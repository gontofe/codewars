package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;

/*
Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

If you need help, here's a reference:

https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)
 */
public class EnumerableMagic25TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr)
                .limit(n)
                .toArray();
    }
}
