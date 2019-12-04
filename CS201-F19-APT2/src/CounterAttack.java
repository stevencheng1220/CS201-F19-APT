import java.util.*;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        Map<String, Integer> myMap = new LinkedHashMap<String, Integer>();
        for (String word : words) myMap.put(word, 0);
        String[] analyzeThis = str.split(" ");
        for (String s : analyzeThis) {
            if (myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s) + 1);
            }
        }
        int[] total = new int[words.length];
        int i = 0;
        for (Integer value : myMap.values()) {
            total[i] = value;
            i += 1;
        }
        return total;
    }
}

// LinkedHashMap is used here because it maintains the order of elements inserted into it. This is important because
// we will need to convert the hashmap values into an int array, and the order matters.

// First, add all the elements in the string array into the map.
// Then, split the str and add each element into the hashmap, remembering to increment the value of the keys.
// Then, iterate through the HashMap values and put it into an int array.