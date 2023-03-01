package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//Your order, please!
//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//
//        Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""

public class YourOrderPlease {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        String[] arr =  words.split(" ");
        String[] orderedWords = new String[arr.length];
        Pattern pattern = Pattern.compile(".*(\\d).*");
        for (int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            boolean matches = matcher.matches();
            int position = Integer.parseInt(matcher.group(1));
            orderedWords[position - 1] = arr[i];
        }
        return Arrays.stream(orderedWords).collect(Collectors.joining(" "));
    }
}
