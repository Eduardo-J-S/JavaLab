package map.Pesquisa;

public class App {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();

        try {
            //wordCount.removeWord("apple");
    
            // Adding words to the word count
            wordCount.addWord("apple", 1);
            wordCount.addWord("banana", 10);
            wordCount.addWord("apple", 3);
            wordCount.addWord("orange", 5);
            wordCount.addWord("banana", 8);
            wordCount.addWord("banana", 4);
    
            //wordCount.removeWord("apples");
    
            // Displaying the word count
            System.out.println("Word Count:");
            wordCount.displayWordCount();
    
            // Finding the most frequent word
            System.out.println("\nMost Frequent Word:");
            System.out.println(wordCount.findMostFrequentWord());
    
            // Removing a word
            wordCount.removeWord("apple");
    
            // Displaying the word count after removal
            System.out.println("\nWord Count after removing 'apple':");
            wordCount.displayWordCount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
