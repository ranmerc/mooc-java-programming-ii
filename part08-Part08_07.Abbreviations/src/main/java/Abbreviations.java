import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbrMap;

    public Abbreviations() {
        this.abbrMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbrMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbrMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbrMap.get(abbreviation);
    }
}
