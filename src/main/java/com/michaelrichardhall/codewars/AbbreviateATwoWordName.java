package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//Abbreviate a Two Word Name
//        Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        patrick feeney => P.F

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(s -> s.substring(0,1))
                .collect(Collectors.joining("."))
                .toUpperCase();
    }
}
