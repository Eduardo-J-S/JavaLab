package set.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        UniqueWordsSet set = new UniqueWordsSet();

        // Adding words to the set
        set.addWord("word1");
        set.addWord("word2");
        set.addWord("word3");
        set.addWord("word3");
        
        // Checking words in the set
        System.out.println("Contains 'word1': " + set.containsWord("word1")); // true
        System.out.println("Contains 'word4': " + set.containsWord("word4")); // false

        // Displaying all unique words
        System.out.println("Unique words: " + set.displayUniqueWords());

        // Removing a word from the set
        set.removeWord("word2");
        System.out.println("Unique words after removal: " + set.displayUniqueWords());

        // Output:

            // Contains 'word1': true
            // Contains 'word4': false
            // Unique words: [word2, word1, word3]   
            // Unique words after removal: [word1, word3]
    }
}
