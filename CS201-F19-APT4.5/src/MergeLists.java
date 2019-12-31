import java.util.*;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        if (a == null || b == null) return null;
        if (a.next == null || b.next == null){
            a.next = b;
            return a;
        }

        ListNode pointer = a;
        ListNode aPoint = a;
        ListNode bPoint = b;

        while (bPoint != null){
            aPoint = aPoint.next;

            pointer.next = bPoint;
            bPoint = bPoint.next;
            pointer = pointer.next;

            pointer.next = aPoint;
            pointer = pointer.next;
        }
        return a;
    }
}

// First two if statements are base cases for the linked lists.
// Create three ListNode pointers to a and b. Create one more for a because we are starting with a.
// Have a while loop that continuously weaves the two linked lists.