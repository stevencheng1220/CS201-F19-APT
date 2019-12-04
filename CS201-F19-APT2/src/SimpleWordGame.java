import java.util.*;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        int total = 0;
        Set<String> mySet = new HashSet<String>(Arrays.asList(player));
        mySet.retainAll(Arrays.asList(dictionary));
        String[] same = mySet.toArray(new String[mySet.size()]);
        for (String s : same) {
            total += s.length() * s.length();
        }
        return total;
    }
}

// Create a set containing all the words array player.
// Get the union of the array player and dictionary using .retainAll.
// Convert set to string array.
// Iterate through string array, increment total by adding the square of the length of each element.