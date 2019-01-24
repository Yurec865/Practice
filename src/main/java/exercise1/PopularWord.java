package exercise1;

import java.util.HashMap;
import java.util.Map;

class PopularWord {

    private String word;

    PopularWord(String result) {
        this.word = result;
    }

    String search() {
        String[] words = word.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (wordToCount.keySet().contains(word))
                wordToCount.put(word, wordToCount.get(word) + 1);
            else
                wordToCount.put(word, 1);
        }
        int maxValueInMap = 0;
        String popular = "";

        for ( Map.Entry<String,Integer> entry : wordToCount.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                popular = key;
            }
            else if (val == maxValueInMap && popular.compareTo(key) > 0)
                popular = key;
        }
        return popular;
    }
}