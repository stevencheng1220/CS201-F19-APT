import java.util.*;

public class RemoveLast {
    /** Iterative Method Only */
    public ListNode remove(ListNode list) {
        if (list == null || list.next == null) return list;
        ListNode preLast = list;
        while (preLast.next.next != null) {
            preLast = preLast.next;
        }
        preLast.next = null;
        return list;
    }

// Removes last node in a list.
// Iterative method uses a while loop and stops at the second to last node, then makes the next pointer to null.