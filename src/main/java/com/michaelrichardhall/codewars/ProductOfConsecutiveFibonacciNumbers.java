package src.main.java.com.michaelrichardhall.codewars;

/*
The Fibonacci numbers are the numbers in the following integer sequence (Fn): 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such that:

𝐹
(
0
)
=
1
𝐹
(
1
)
=
1
𝐹
(
𝑛
)
=
𝐹
(
𝑛
−
1
)
+
𝐹
(
𝑛
−
2
)
F(0)=1
F(1)=1
F(n)=F(n−1)+F(n−2)
Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying:

𝐹
(
𝑛
)
∗
𝐹
(
𝑛
+
1
)
=
𝑝
𝑟
𝑜
𝑑
F(n)∗F(n+1)=prod
Your function takes an integer (prod) and returns an array/tuple (check the function signature/sample tests for the return type in your language):

if F(n) * F(n+1) = prod:
(F(n), F(n+1), true)
If you do not find two consecutive F(n) verifying F(n) * F(n+1) = prod:
(F(n), F(n+1), false)
where F(n) is the smallest one such as F(n) * F(n+1) > prod.
Examples:
714 ---> (21, 34, true)
--> since F(8) = 21, F(9) = 34 and 714 = 21 * 34

800 --->  (34, 55, false)
--> since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
 */
public class ProductOfConsecutiveFibonacciNumbers {
    public static long[] productFib(long prod) {
        Long n = 0L;
        Long m = 0L;
        Long nplusone = 1L;
        Long calculatedProduct = n * nplusone;
        while (calculatedProduct < prod) {
            m = n + nplusone;
            n = nplusone;
            nplusone = m;
            calculatedProduct = n * nplusone;
        }
        long[] result = new long[3];
        result[0] = n;
        result[1] = nplusone;
        result[2] = calculatedProduct == prod ? 1 : 0;
        return result;
    }
}
