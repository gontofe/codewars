package src.main.java.com.michaelrichardhall.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write Number in Expanded Form
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num)
    {
        int numLength = String.valueOf(num).length();
        return IntStream.rangeClosed(0, numLength - 1)
                .mapToObj(i -> String.valueOf(num).charAt(i) + "0".repeat(numLength - i - 1))
                .filter(s -> !(s.matches("0+")))
                .collect(Collectors.joining(" + "));
    }
}
