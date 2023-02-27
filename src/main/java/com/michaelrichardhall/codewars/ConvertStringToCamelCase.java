package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//Convert string to camel case
//        Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
//
//        Examples
//        "the-stealth-warrior" gets converted to "theStealthWarrior"
//        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        if (s.length() > 0) {
            String baseString = Arrays.stream(s.split("[-_]"))
                    .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                    .collect(Collectors.joining(""));
            return s.substring(0, 1) + baseString.substring(1);
        }
        return s;
    }
}
