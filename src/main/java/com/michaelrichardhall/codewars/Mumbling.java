package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//Mumbling
//        This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
//        The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Mumbling {
    public static String accum(String s) {
        String[] mumble = new String[s.length()];
        for (int i = 0; i < s.length(); i++){
            String word = String.valueOf(s.charAt(i)).repeat(i + 1);
            mumble[i] = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        }
        return Arrays.stream(mumble)
                .collect(Collectors.joining("-"));
    }
}
