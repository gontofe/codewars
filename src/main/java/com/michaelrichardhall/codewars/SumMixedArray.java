package src.main.java.com.michaelrichardhall.codewars;

import java.util.List;

//Sum Mixed Array
//        Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//        Return your answer as a number.

public class SumMixedArray {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return (int) mixed.stream()
                .map(i -> i instanceof String ? Integer.valueOf((String) i) : Integer.valueOf((int) i))
                .reduce(0, (x, y) -> x + y);
    }
}
