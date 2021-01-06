package pjatk.lab10;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String text = "Ala ma kota a kot ma Ale kot Ale ma";
        System.out.println(skorowidzLiterowy(text));
    }
    static Map<Character, Set<Integer>> skorowidzLiterowy(String text) {
        System.out.println(text);
        Map<Character, Set<Integer>> result = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c==' ') continue;
            Set<Integer> indexes;
            if (!result.containsKey(c)) {
                indexes = new TreeSet<>();
                indexes.add(i);
            } else {
                indexes = result.get(c);
                indexes.add(i);
            }
            result.put(c, indexes);
        }
        return result;
    }
}
