package src.main.java.com.michaelrichardhall.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Write Number in Expanded Form
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num)
    {
        String number = String.valueOf(num);
        List<String> expandedForms = new ArrayList<String>();
        for (int i = 0; i <= number.length() - 1; i++) {
            char c = number.charAt(i);
            if (c != '0') {
                expandedForms.add(c + "0".repeat(number.length() - i - 1));
            }
        }
        return expandedForms.stream()
                .collect(Collectors.joining(" + "));
    }
}
