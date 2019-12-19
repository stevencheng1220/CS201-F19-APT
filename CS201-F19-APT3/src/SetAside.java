import java.util.*;

public class SetAside {
    public String common(String[] list) {
        HashSet<String> mySet = new HashSet<>();
        mySet.addAll(Arrays.asList(list[0].split(" ")));
        for (int i = 1; i < list.length; i+=1){
            String[] splitted = list[i].split(" ");
            mySet.retainAll(Arrays.asList(splitted));
        }
        String[] result = mySet.toArray(new String[mySet.size()]);
        Arrays.sort(result);
        return String.join(" ", result);
    }
}

// Create a new HashSet with list[0] elements in split form.
// Then iterate through the given string array and use .retainAll on each index of list.
// Convert result back to an array and sort it.