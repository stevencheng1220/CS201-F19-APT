import java.util.*;

public class ListsEqual {
    /** Iterative method */
    public int equal (ListNode a1, ListNode a2) {
        while (a1 != null || a2 != null){
            if (a1 == null || a2 == null) return 0;
            if (a1.info != a2.info) return 0;
            a1 = a1.next;
            a2 = a2.next;
        }
        return 1;
    }

    /** Recursive method */
    public int equal (ListNode a1, ListNode a2) {
        return helper(a1, a2, 0);
    }

    public int helper (ListNode a1, ListNode a2, int curr) {
        if (a1 == null && a2 == null) return 1;
        else if (a1 == null || a2 == null) return 0;
        else if (a1.info != a2.info) return 0;
        return helper(a1.next, a2.next, 1);
    }
}

// Returns 0 or 1 depending if 2 LinkedLists the same.
// Iterative method iterates through each node in the list. If the lengths are uneven or if the info do not match,
// return 0, else if all is the same, return 1.

// Recursive method utilizes a helper method that has 3 cases:
// 1. If a1 and a2 are both null, return 1.
// 2. If either a1 and a2 are null, return 0;
// 3. If a1.info != a2.info, return 0;
// Then we recursively check the next node.
