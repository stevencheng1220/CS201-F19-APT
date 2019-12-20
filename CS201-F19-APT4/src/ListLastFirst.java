import java.util.*;

public class ListLastFirst {
    /** Iterative method */
    public ListNode move(ListNode list) {
        if (list == null || list.next == null) return list;
        ListNode first = list;
        while (list.next.next != null)
            list = list.next;
        ListNode end = new ListNode(list.next.info, first);
        list.next = null;
        return end;
    }

    /** Recursive method */
    public ListNode move(ListNode list) {
        if (list == null || list.next == null) return list;
        ListNode end = helper(list, new ListNode(list.info, list.next));
        ListNode start = new ListNode(end.next.info, list);
        end.next = null;
        return start;
    }

    private ListNode helper(ListNode list, ListNode pointer){
        if (pointer.next.next == null) return pointer;
        return helper(list, pointer.next);
    }
}

// Places last Node as the first Node in the List.
// Iterative method iterates through a while loop and gets to the second to last node so that the .next pointer is
// pointing to the last node. Then, a new ListNode node is created with the last node's information and placed in
// the very front.
// The last node is removed (pointer from the second to last node is set to null).

// Recursive solution uses a helper method to find the last node recursively. Then, a new node is created with the
// last node's information. The last node is then removed (pointer from the second to last node is set to null).
