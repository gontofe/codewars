package src.main.java.com.michaelrichardhall.codewars;

import java.util.stream.IntStream;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> arr[i])
                .toArray();
    }
}
