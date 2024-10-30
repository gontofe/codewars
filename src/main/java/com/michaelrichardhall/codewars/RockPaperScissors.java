package src.main.java.com.michaelrichardhall.codewars;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
 */
public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        Map<String, String> map = Stream.of(new String[][]{
                {"rock", "scissors"},
                {"paper", "rock"},
                {"scissors", "paper"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        if (p1.equals(p2)) {
            return "Draw!";
        } else {
            if (map.get(p1).equals(p2)) {
                return "Player 1 won!";
            } else {
                return "Player 2 won!";
            }
        }
    }
}
