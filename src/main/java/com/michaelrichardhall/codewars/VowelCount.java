package src.main.java.com.michaelrichardhall.codewars;

import java.util.regex.Pattern;

//Vowel Count
//        Return the number (count) of vowels in the given string.
//
//        We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//        The input string will only consist of lower case letters and/or spaces.

public class VowelCount {
    private static final Pattern VOWELS_PATTERN = Pattern.compile("[aeoiu]");

    public static int getCount(String str) {
        return (int) VOWELS_PATTERN.matcher(str).results().count();
    }
}
