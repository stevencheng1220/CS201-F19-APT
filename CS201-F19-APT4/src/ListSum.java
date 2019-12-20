import java.util.*;

public class ListSum {
    /** Iterative method */
    public int sum(ListNode list, int thresh) {
        int count = 0;
        while (list != null){
            if (list.info > thresh) count += list.info;
            list = list.next;
        }
        return count;
    }

    /** Recursive method */
    public int sum(ListNode list, int thresh) {
        return helper(list, thresh, 0);
    }

    private int helper(ListNode list, int thresh, int total){
        if (list == null) return total;
        if (list.info > thresh) total += list.info;
        return helper(list.next, thresh, total);
    }
}

// Returns sum of all nodes in a Linked List.
// Iterative solution iterates through whole list and  only increments count with list.info if it is larger than given
// int thresh.
// Recursive solution contains three parts: base case, if statement case that increments total if list.info is larger
// than int thresh, and the return call which recursively calls the next element in the list.
