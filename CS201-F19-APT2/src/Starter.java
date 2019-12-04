import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int total = 0;
        Set<String> mySet = new HashSet<String>(Arrays.asList(words));
        String[] nonDup = mySet.toArray(new String[mySet.size()]);
        for (String s : nonDup) {
            if (Character.toString(s.charAt(0)).equals(first)){
                total += 1;
            }
        }
        return total;
    }
}

// Create set to remove duplicates from words array.
// Convert to array, then iterate through the array, only incrementing total if the first char of the element is equal to
// String first.

