package src.main.java.com.michaelrichardhall.codewars;

//Simple Fun #176: Reverse Letter
//Task
//Given a string str, reverse it and omit all non-alphabetic characters.
//
//Example
//For str = "krishan", the output should be "nahsirk".
//
//For str = "ultr53o?n", the output should be "nortlu".
//
//Input/Output
//[input] string str
//A string consists of lowercase latin letters, digits and symbols.
//
//[output] a string

public class SimpleFun176ReverseLetter {
    public static String reverseLetter(final String str) {
        StringBuilder sb = new StringBuilder(str.replaceAll("[^a-zA-Z]",""));
        return sb.reverse().toString();
    }
}
