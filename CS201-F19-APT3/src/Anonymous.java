import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int total = 0;
        int[] available = getCounts(headlines);
        for (String s : messages){
            int[] required = getCounts(s.split(" "));
            if (compare(available, required)){
                total += 1;
            }
        }
        return total;
    }

    private int[] getCounts(String[] strings){
        int[] counts = new int[123];
        for (String s : strings){
            for (char ch : s.toLowerCase().toCharArray()){
                counts[ch] += 1;
            }
        }
        return counts;
    }

    private boolean compare(int[] available, int[] required){
        for (char ch = 'a'; ch <= 'z'; ch+=1) {
            if (required[ch] > available[ch]) {
                return false;
            }
        }
        return true;
    }
}

// Helper method getCounts tallies up the counts of all characters given in the String[] headlines.
// For loop in the main method howMany that iterates through the messages and checks if the amount of specific characters
// required are sufficient. If it works for a specific message, then total is incremented by 1.