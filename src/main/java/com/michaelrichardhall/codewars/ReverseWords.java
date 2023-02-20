package src.main.java.com.michaelrichardhall.codewars;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

//Reverse words
//        Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

public class ReverseWords {
    public static String reverseWords(final String original)
    {
        Pattern pattern = Pattern.compile("\\s+|\\S+");
        String ugh = pattern.matcher(original)
                .results()
                .map(s -> new StringBuilder(s.group()).reverse())
                .collect(Collectors.joining(""));
        System.out.println(ugh);
        return ugh;
    }
}
