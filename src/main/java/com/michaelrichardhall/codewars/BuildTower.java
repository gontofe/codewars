package src.main.java.com.michaelrichardhall.codewars;

import java.util.stream.IntStream;

//Build Tower
//        Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
//
//        For example, a tower with 3 floors looks like this:
//
//        [
//        "  *  ",
//        " *** ",
//        "*****"
//        ]
//        And a tower with 6 floors looks like this:
//
//        [
//        "     *     ",
//        "    ***    ",
//        "   *****   ",
//        "  *******  ",
//        " ********* ",
//        "***********"
//        ]

public class BuildTower {
    public static String[] towerBuilder(int nFloors)
    {
        return IntStream.rangeClosed(1,nFloors)
                .mapToObj(i -> {int pad = 0;
                            if (i < nFloors){ pad = ((nFloors * 2 - 1) - (i * 2 - 1)) / 2;}
                            return String.format("%s%s%s", " ".repeat(pad), "*".repeat(i * 2 - 1), " ".repeat(pad));
                        }
                )
                .toArray(String[]::new);

    }
}
