package src.main.java.com.michaelrichardhall.codewars;

import java.util.List;
import java.util.stream.Collectors;

//Ones and Zeroes
//        Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//        Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
//
//        Examples:
//
//        Testing: [0, 0, 0, 1] ==> 1
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 0, 1] ==> 5
//        Testing: [1, 0, 0, 1] ==> 9
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 1, 0] ==> 6
//        Testing: [1, 1, 1, 1] ==> 15
//        Testing: [1, 0, 1, 1] ==> 11
//        However, the arrays can have varying lengths, not just limited to 4.

public class OnesAndZeroes {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining("")), 2);
    }
}
