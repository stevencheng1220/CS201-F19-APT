import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        if (words.length == 0) return null;

        Set<String> mySet = new TreeSet<>(Arrays.asList(words));
        String[] uniqueWords = mySet.toArray(new String[mySet.size()]);

        ListNode list = new ListNode(uniqueWords[uniqueWords.length-1].length());
        for (int i = uniqueWords.length-2; i >= 0; i -= 1){
            int size = uniqueWords[i].length();
            list = new ListNode(size, list);
        }
        return list;
    }
}

// Create a treeset and add array words in to remove duplicates, then convert back to array.
// Iterate through array from the last element since we are building the list from the back and upwards.