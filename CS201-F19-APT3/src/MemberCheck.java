import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        Set<String> intersection1 = new HashSet<>(Arrays.asList(club1));
        intersection1.retainAll(Arrays.asList(club2));
        Set<String> intersection2 = new HashSet<>(Arrays.asList(club2));
        intersection2.retainAll(Arrays.asList(club3));
        Set<String> intersection3 = new HashSet<>(Arrays.asList(club3));
        intersection3.retainAll(Arrays.asList(club1));

        Set<String> total = new HashSet<>(intersection1);
        total.addAll(intersection2);
        total.addAll(intersection3);

        String[] ret = total.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;
    }
}

// Create three different HashSets that are the intersections of club1 and club2, club2 and club3, club3 and club1.
// Add all three intersection sets together.
// Return the final HashSet in the form of a sorted array.