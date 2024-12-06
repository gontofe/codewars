package src.main.java.com.michaelrichardhall.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[0];
        }
        int elements = 3;
        List<Double> doubleList = new ArrayList<>();
        for (double d : s) {
            doubleList.add(d);
        }
        doubleList.add(Arrays.stream(s).sum());
        while (elements < n - 1) {
            doubleList.add(doubleList.stream().skip(doubleList.size() - 3).mapToDouble(d -> d).sum());
            elements += 1;
        }
        return doubleList.stream().mapToDouble(d -> d).limit(n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(new double[]{1, 1, 1}, 10));
    }
}
