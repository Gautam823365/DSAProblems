package String_problem;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDup {
    public static void printDuplicates(String s) {

        // Hash map to store frequency of each character
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Traverse the map and print characters with count > 1
        for (Map.Entry<Character, Integer> it : freq.entrySet()) {
            if (it.getValue() > 1) {
                System.out.print("['" + it.getKey() + "', " + it.getValue() + "], ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        printDuplicates(s);

    }
}
