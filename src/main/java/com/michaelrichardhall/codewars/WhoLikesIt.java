package src.main.java.com.michaelrichardhall.codewars;

//Who likes it?
//        You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
//
//        Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
//
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//        Note: For 4 or more names, the number in "and 2 others" simply increases.

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        StringBuilder sb = new StringBuilder();

        if (names.length == 0) {
            sb.append("no one");
        } else if(names.length == 1) {
            sb.append(names[0]);
        } else if (names.length == 2) {
            sb.append(String.format("%s and %s", names[0], names[1]));
        } else if (names.length == 3) {
            sb.append(String.format("%s, %s and %s", names[0], names[1], names[2]));
        } else if (names.length > 3) {
            sb.append(String.format("%s, %s and %d others", names[0], names[1], names.length - 2));
        }
        return names.length > 1 ? sb.append(" like this").toString() : sb.append(" likes this").toString();
    }
}
