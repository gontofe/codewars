package src.main.java.com.michaelrichardhall.codewars;

import java.util.ArrayList;
import java.util.List;

/*
In this simple exercise, you will build a program that takes a value, integer , and returns a list of its multiples up to another value, limit . If limit is a multiple of integer, it should be included as well. There will only ever be positive integers passed into the function, not consisting of 0. The limit will always be higher than the base.

For example, if the parameters passed are (2, 6), the function should return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.
 */
public class FindMultiplesOfANumber {
    public static int[] find(int base, int limit) {
        int multiplier = 1;
        int multiple = multiplier * base;
        List<Integer> multiples = new ArrayList<>();
        while (multiple <= limit) {
            multiples.add(multiple);
            multiplier += 1;
            multiple = multiplier * base;
        }
        return multiples.stream().mapToInt(Integer::intValue).toArray();
    }
}
