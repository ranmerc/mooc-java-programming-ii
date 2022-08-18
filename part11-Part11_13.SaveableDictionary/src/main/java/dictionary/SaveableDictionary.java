package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveableDictionary {

    private ArrayList<String> words;
    private ArrayList<String> translations;
    private String fileName;

    public SaveableDictionary() {
        words = new ArrayList<>();
        translations = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this();
        fileName = file;
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (int i = 0; i < words.size(); i++) {
                printWriter.println(words.get(i) + ":" + translations.get(i));
            }

            printWriter.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!words.contains(word)) {
            words.add(word);
            translations.add(translation);
        }
    }

    public String translate(String word) {
        if (words.contains(word)) {
            return translations.get(words.indexOf(word));
        }

        if (translations.contains(word)) {
            return words.get(translations.indexOf(word));
        }

        return null;
    }

    public void delete(String word) {
        if (words.contains(word)) {
            translations.remove(words.indexOf(word));
            words.remove(word);
        }

        if (translations.contains(word)) {
            words.remove(translations.indexOf(word));
            translations.remove(word);
        }
    }
}
