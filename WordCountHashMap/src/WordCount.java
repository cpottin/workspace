import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {


    public static void main(String[] args) {
        String initialSentence = "Hello I love Boston. Yes, you do Love Boston.";
        String[] initialWordsInArray = initialSentence.split("[, ?.@]+");

        List<String> initialWords = Arrays.asList(initialWordsInArray);
        System.out.println(initialWords);

        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

        for (String word : initialWords) {
            if (uniqueWordsMap.containsKey(word)) {
                Integer count = uniqueWordsMap.get(word);
                uniqueWordsMap.put(word, ++count);
            }
            else {
                uniqueWordsMap.put(word, 1);
            }
        }
        System.out.println(uniqueWordsMap.entrySet());
        }
    }

