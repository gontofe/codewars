package src.main.java.com.michaelrichardhall.codewars;

//Switch it Up!
//When provided with a number between 0-9, return it in words.
//
//        Input :: 1
//
//        Output :: "One".
//
//        If your language supports it, try using a switch statement.

public class SwitchItUp {
    public static String switchItUp(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            default -> "Nine";
        };
    }
}
