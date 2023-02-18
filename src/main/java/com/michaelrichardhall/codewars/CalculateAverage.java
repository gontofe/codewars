package src.main.java.com.michaelrichardhall.codewars;

//Calculate average
//        Write a function which calculates the average of the numbers in a given list.
//
//        Note: Empty arrays should return 0.

public class CalculateAverage {
    public static double find_average(int[] array){
        int arraySize = array.length;
        if (arraySize >  0) {
            int total = 0;
            for (int i: array) {
                total += i;
            }
            return (double) total / arraySize;
        }
        return 0;
    }
}
