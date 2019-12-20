import java.util.*;

public class RemoveMin {
    /** Iterative method Only */
    public ListNode remove (ListNode list) {
        ListNode min = findMin(list);
        if (min == list) return list.next;
        ListNode front = list;
        while (list.next != min) {
            list = list.next;
        }
        list.next = min.next;
        return front;
    }

    private ListNode findMin(ListNode list){
        ListNode min = list;
        list = list.next;
        while (list != null){
            if (list.info < min.info) min = list;
            list = list.next;
        }
        return min;
    }
}

// Removes the minimum value node from the list.
// Iterative method utilizes a helper method findMin to find the minimum node.
// Then, we iterate through the list until list == min, then we skip over min, effectively removing the minimum node
// from our list.
