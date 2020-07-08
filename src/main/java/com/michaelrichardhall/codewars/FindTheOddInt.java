package src.main.java.com.michaelrichardhall.codewars;

import java.util.HashMap;
import java.util.Map;

//Find the odd int
//        Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> intMap = new HashMap();
        for(int i : a) {
            Integer count = intMap.get(i);
            count = (count != null ? count + 1 : 1);
            intMap.put(i, count);
        }
        for(Integer k: intMap.keySet()) {
            if (intMap.get(k) % 2 != 0) {
                odd = k.intValue();
            }
        }
        return odd;
    }
}
