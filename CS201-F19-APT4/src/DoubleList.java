import java.util.*;

public class DoubleList {
    /** Iterative method */
    public ListNode bigify(ListNode list) {
        ListNode first = list;
        while (list != null){
            list.next = new ListNode(list.info, list.next);
            list = list.next.next;
        }
        return first;
    }

    /** Recursive method */
    public ListNode bigify(ListNode list) {
        if (list == null) return null;
        list.next = new ListNode(list.info, bigify(list.next));
        return list;
    }
}

// Duplicates all nodes in a given list.
// Iterative solution utilizes a while loop and simply adds a new node (in front of the original) for every node.
// Recursive solution calls the method again for the next list node in the generation of the new ListNode.
