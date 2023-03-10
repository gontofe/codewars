package src.main.java.com.michaelrichardhall.codewars;

//I love you, a little , a lot, passionately ... not at all
//        Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:
//
//        "I love you"
//        "a little"
//        "a lot"
//        "passionately"
//        "madly"
//        "not at all"
//        If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.
//
//        When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
//
//        Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of petals. The number of petals is always greater than 0.

public class ILoveYouALittleALotPassionatelyNotAtAll {
    public static String howMuchILoveYou(int nb_petals) {
        int petals = nb_petals % 6;

        return switch (petals) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            default -> "not at all";
        };
    }
}
