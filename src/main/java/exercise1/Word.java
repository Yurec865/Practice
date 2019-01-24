package exercise1;

import java.util.HashMap;

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word() {

    }

    public String count() {
        String[] words = word.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }
        return word;
    }
}
