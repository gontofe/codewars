import java.util.stream.IntStream;
import java.util.stream.Collectors;

//Anagram Detection
//An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//Note: anagrams are case insensitive
//
//Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//Examples
//"foefet" is an anagram of "toffee"
//
//"Buckethead" is an anagram of "DeathCubeK"
  
public class AnagramDetection {
  public static boolean isAnagram(String test, String original) {
    return test.toLowerCase().chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining("")).equals(original.toLowerCase().chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining("")));
  }
}
