package extra.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Character, Integer> frequencyDictionary = new HashMap<>();
        String word = "молоко скисло";

        for (char ch : word.toCharArray()) {
            if (!frequencyDictionary.containsKey(ch)) frequencyDictionary.put(ch, 1);
            else frequencyDictionary.put(ch, frequencyDictionary.get(ch) + 1);
        }

        System.out.println(frequencyDictionary);
    }
}
