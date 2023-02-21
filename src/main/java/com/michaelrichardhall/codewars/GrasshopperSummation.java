package src.main.java.com.michaelrichardhall.codewars;

import java.util.stream.IntStream;

//Summation
//        Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
//
//        For example (Input -> Output):
//
//        2 -> 3 (1 + 2)
//        8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

public class GrasshopperSummation {
    public static int summation(int n) {

        return IntStream.range(0, n + 1)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
