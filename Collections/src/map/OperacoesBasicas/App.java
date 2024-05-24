package map.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        Dictionary dicionario = new Dictionary();

        // Adicionando palavras e suas definições
        dicionario.addWord("hello", "used as a greeting or to begin a conversation");
        dicionario.addWord("world", "the earth, together with all of its countries and peoples");

        // Exibindo todas as palavras e suas definições
        System.out.println("Palavras e suas definições:");
        dicionario.displayWords();

        // Pesquisando por uma palavra
        String definicao = dicionario.searchWord("hello");
        System.out.println("\nDefinição de 'hello': " + definicao);

        // Removendo uma palavra
        dicionario.removeWord("world");
        System.out.println("\nApós remover 'world':");
        dicionario.displayWords();
    }
}
