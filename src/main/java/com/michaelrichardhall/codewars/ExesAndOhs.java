package src.main.java.com.michaelrichardhall.codewars;

//Exes and Ohs
//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//        Examples input/output:
//
//        XO("ooxx") => true
//        XO("xooxx") => false
//        XO("ooxXm") => true
//        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//        XO("zzoo") => false

public class ExesAndOhs {
    public static boolean getXO (String str) {

        int countx = 0;
        int county = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                countx++;
            } else if (str.toLowerCase().charAt(i) == 'o') {
                county++;
            }
        }
        return (countx == county);
    }
}
