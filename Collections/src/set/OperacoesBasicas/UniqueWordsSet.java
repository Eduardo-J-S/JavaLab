package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {

    private Set<String> uniqueWords;

    public UniqueWordsSet(){
        this.uniqueWords = new HashSet<>();
    }

    public void addWord(String word){
        uniqueWords.add(word);
    }

    public void removeWord(String word){
        if(!this.uniqueWords.contains(word)){
            throw new IllegalStateException("The word is not present in the set.");
        }
        uniqueWords.remove(word);
    }

    public boolean containsWord(String word){
        if(uniqueWords.isEmpty()){
            throw new IllegalStateException("The set is empty.");
        }
        boolean containsWordString = false;
        for (String string : uniqueWords) {
            if (string.equals(word)) {
                containsWordString = true;
                break;
            }
        }
        return containsWordString;
    }

    public Set<String> displayUniqueWords(){
        if (uniqueWords.isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        return new HashSet<>(this.uniqueWords);
    }
}