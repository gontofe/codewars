package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.

Notes
You can see another examples in the "Sample tests".
 */
public class Meeting {

    public static String meeting(String s) {
        Comparator<String> comparator = Comparator.comparing((String name) -> name.split(":")[1])
                .thenComparing((String name) -> name.split(":")[0]);
        return Arrays.stream(s.split(";"))
                .sorted(comparator)
                .map(String::toUpperCase)
                .map(name -> String.format("(%s, %s)", name.split(":")[1], name.split(":")[0]))
                .collect(Collectors.joining("")).toString();
    }

    public static void main(String[] args) {
        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }
}
