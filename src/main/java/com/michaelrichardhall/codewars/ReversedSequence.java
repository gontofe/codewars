package src.main.java.com.michaelrichardhall.codewars;

import java.util.ArrayList;
import java.util.List;

//Reversed sequence
//Build a function that returns an array of integers from n to 1 where n>0.
//
//        Example : n=5 --> [5,4,3,2,1]

public class ReversedSequence {
    public static int[] reverse(int n){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i=n; i > 0; i--){
            intList.add(i);
        }
        return intList.stream().mapToInt(x -> x.intValue()).toArray();
    }
}
