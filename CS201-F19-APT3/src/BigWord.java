import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String s : sentences){
            String[] splitted = s.split(" ");
            for (String y : splitted){
                String s1 = y.toLowerCase();
                myMap.putIfAbsent(s1, 0);
                myMap.put(s1, myMap.get(s1) + 1);
            }
        }
        String result = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value > max){
                max = value;
                result = key;
            }
        }
        return result;
    }
}

// Generate a HashMap with String as keys and Integer as values. Count the number of occurrences of specific words in the
// given String[] of words.
// Make sure that when adding into the HashMap all strings are made .toLowerCase().
// Lastly, iterate through the HashMap and find the word with the highest integer count. Return that.