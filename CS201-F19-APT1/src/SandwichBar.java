import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        Set<String> ingredients = new HashSet<String>(Arrays.asList(available));
        for (String order : orders){
            String[] stuff = order.split(" ");
            boolean makeable = true;
            for (String s : stuff) {
                makeable = ingredients.contains(s) && makeable;
            }
            if (makeable == true){
                return Arrays.asList(orders).indexOf(order);
            }
        }
        return -1;
    }
}

// create a hashSet for available ingredients as duplicates do not matter
// for loop that iterates through each order
// split each orders string with " ", creating an array
// for loop iterating through this array
// bool to check if it is makeable, have two conditions, one for if the ingredient is in set and the previous bool
// if statement for if bool is true at the end, then return the index of that specific order
// else, return -1