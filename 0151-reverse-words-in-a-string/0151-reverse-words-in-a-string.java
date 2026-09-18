import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public String reverseWords(String s) {
        String [] wordsArray= s.trim().split("\\s+");

        List<String> wordList= Arrays.asList(wordsArray);
        Collections.reverse(wordList);

        return String.join(" ", wordList);
    }
}