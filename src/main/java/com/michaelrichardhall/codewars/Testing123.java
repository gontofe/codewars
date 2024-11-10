package src.main.java.com.michaelrichardhall.codewars;

import java.util.List;
import java.util.stream.IntStream;

/*
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
public class Testing123 {
    public static List<String> number(List<String> lines) {
        return IntStream.rangeClosed(1, lines.size())
                .mapToObj(i -> i + ": " + lines.get(i - 1))
                .toList();
    }
}
