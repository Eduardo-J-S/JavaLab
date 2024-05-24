package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        this.dictionaryMap.put(word, definition);
    }

    public void removeWord(String word) {
        if (!this.dictionaryMap.isEmpty()) {
            this.dictionaryMap.remove(word);
        } else {
            System.out.println("The map is empty.");
        }
    }

    public void displayWords() {
        for (Map.Entry<String, String> entry : dictionaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public String searchWord(String word) {
        if (!this.dictionaryMap.isEmpty()) {
            return this.dictionaryMap.get(word);
        } else {
            return "The map is empty.";
        }
    }
}