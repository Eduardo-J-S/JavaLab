package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    Map<String, Integer> wordCountMap;

    public WordCount() {
        this.wordCountMap = new HashMap<>();
    }

    public void addWord(String word, Integer count) {
        for (Map.Entry<String, Integer> element : wordCountMap.entrySet()) {
            if (element.getKey().equals(word)) {
                this.wordCountMap.put(word, element.getValue() + count);
                return;
            }
        }
        this.wordCountMap.put(word, count);
    }

    public void removeWord(String word) {
        if (!this.wordCountMap.isEmpty()) {
            if (wordCountMap.containsKey(word)) {
                this.wordCountMap.remove(word);
            } else {
                System.out.println("The map doesn't contain this word " + word);
            }
        } else {
            System.out.println("The map is empty.");
        }
    }

    public void displayWordCount(){
        if (this.wordCountMap.isEmpty()) {
            throw new IllegalStateException("The map is empty.");
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public String findMostFrequentWord() {
        if (this.wordCountMap.isEmpty()) {
            throw new IllegalStateException("The map is empty.");
        }
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentWord + ": " + maxCount;
    }
}