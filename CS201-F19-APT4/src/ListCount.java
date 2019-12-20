import java.util.*;

public class ListCount {
    /** Iterative method */
    public int count (ListNode list) {
        int count = 0;
        while (list != null){
            count += 1;
            list = list.next;
        }
        return count;
    }

    /** Recursive method */
    public int count (ListNode list) {
        if (list == null) return 0;
        return 1 + count(list.next);
    }
}

// Counts number of nodes in a List.
// Iterative solution uses while loop and increments count for each node.
// Recursive method returns 1 + recursive call for the next listNode.
