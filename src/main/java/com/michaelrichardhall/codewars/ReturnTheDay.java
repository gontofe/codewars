package src.main.java.com.michaelrichardhall.codewars;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Complete the function which returns the weekday according to the input number:

1 returns "Sunday"
2 returns "Monday"
3 returns "Tuesday"
4 returns "Wednesday"
5 returns "Thursday"
6 returns "Friday"
7 returns "Saturday"
Otherwise returns "Wrong, please enter a number between 1 and 7"
 */

public class ReturnTheDay {
    public static String getDay(int n) {
        Map<Integer, String> map = Stream.of(new Object[][]{
                {1, "Sunday"},
                {2, "Monday"},
                {3, "Tuesday"},
                {4, "Wednesday"},
                {5, "Thursday"},
                {6, "Friday"},
                {7, "Saturday"}
        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));
        return Optional.ofNullable(map.get(n)).orElse("Wrong, please enter a number between 1 and 7");
    }
}
