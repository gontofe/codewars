package src.main.java.com.michaelrichardhall.codewars;

//Reversed Strings
//        Complete the solution so that it reverses the string passed into it.
//
//        'world'  =>  'dlrow'
//        'word'   =>  'drow'

public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
