package pjatk.lab10;

import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        String text = "Ala ma kota a kot ma Ale kot Ale ma";
        System.out.println(countWords(text));
    }
    static Map<String, Integer> countWords(String text) {
        System.out.println(text);
        Map<String, Integer> result = new TreeMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (!result.containsKey(word))
                result.put(word, 1);
            else
                result.put(word, result.get(word) + 1);
        }
        return result;
    }
}