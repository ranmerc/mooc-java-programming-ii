import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionaryMap;

    public DictionaryOfManyTranslations() {
        this.dictionaryMap = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionaryMap.putIfAbsent(word, new ArrayList<>());

        this.dictionaryMap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionaryMap.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dictionaryMap.remove(word);
    }
}
