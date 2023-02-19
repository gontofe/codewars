package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;

//Sum of positive
//You get an array of numbers, return the sum of all of the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.

public class SumOfPositive {
  public static int sum(int[] arr){
    return Arrays.stream(arr)
      .filter(i -> i > 0)
      .sum();
  }
}
