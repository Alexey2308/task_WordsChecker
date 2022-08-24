import java.util.HashSet;
import java.util.Set;


public class WordsChecker {
    Set<String> set = new HashSet<>();

    public void textToSet(String text) {
        String[] words = (text.split("\\P{IsAlphabetic}+"));
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
    }

    public boolean hashWord(String word) {
        if (set.contains(word)) {
            System.out.println("Слово " + word + " было в тексте!");
            return true;
        }
        System.out.println("Слова " + word + " в тексте нет!");
        return false;
    }
}
