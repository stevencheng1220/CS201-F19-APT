import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            if (minLength <= s.length()) {
                if (! result.contains(s)) result.add(s);
            }
        }
        String[] results = result.toArray(new String[result.size()]);
        return results;
    }
}

// Iterate through the list, if the string exceeds the minLength number, then add it to the result ArrayList.
// Convert arrayList into string array.
