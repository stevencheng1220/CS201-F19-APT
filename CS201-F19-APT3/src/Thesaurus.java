import java.util.*;

public class Thesaurus {
    private Set<String> sToSet(String s) {
        String[] splitted = s.split(" ");
        return new TreeSet<String>(Arrays.asList(splitted));
    }

    private String collToS(Collection<String> elems) {
        String[] res = elems.toArray(new String[0]);
        return String.join(" ", res);
    }

    private int numInCommon(Set<String> a, Set<String> b) {
        Set<String> intersection = new HashSet<String>(a);
        intersection.retainAll(b);
        return intersection.size();
    }

    private Set<String> union(Set<String> a, Set<String> b) {
        Set<String> results = new TreeSet<>(a);
        results.addAll(b);
        return results;
    }

    public String[] edit(String[] entry) {
        List<Set<String>> myList = new ArrayList<>();
        for (String s : entry) myList.add(sToSet(s));

        boolean merged = true;
        while (merged) {
            merged = false;
            for (int i = 0; i < myList.size(); i += 1) {
                for (int j = 0; j < i; j += 1) {
                    if (numInCommon(myList.get(i), myList.get(j)) >= 2) {
                        myList.add(union(myList.get(j), myList.get(i)));
                        myList.remove(i);
                        myList.remove(j);
                        merged = true;
                    }
                    if (merged) break;
                }
                if (merged) break;
            }
        }
        String[] ret = new String[myList.size()];
        for (int i = 0; i < ret.length; i += 1) ret[i] = collToS(myList.get(i));
        Arrays.sort(ret);
        return ret;
    }
}

// There are four helper methods utilized in Thesaurus.
// sToSet takes a String and splits it, then returns each element in a TreeSet
// collToS takes a Collection of String and returns a string joined with whitespace.
// numInCommon takes two sets and finds the intersection (.retainAll) between them.
// union takes two sets and returns a set with elements from both sets.

// The main method edit first takes each element in the given string array and passes them through sToSet, then adds it
// to an arraylist of sets.
// Go through a while loop and continuously combine sets that have identical words. This is done by calling checking
// with numInCommon, then union if it passes as true.
// Lastly, we convert the list into a string array and sort it.
