import java.util.*;

public class ListShift {
    public ListNode shift(ListNode start, int key) {
        ListNode less = null;
        ListNode lless = null;
        ListNode greater = null;
        ListNode lgreater = null;

        while (start != null) {
            if (start.info > key) {
                if (lgreater == null) {
                    greater = new ListNode(start.info);
                    lgreater = greater;
                }
                else {
                    lgreater.next = new ListNode(start.info);
                    lgreater = lgreater.next;
                }
            }
            else {
                if (lless == null) {
                    less = new ListNode(start.info);
                    lless = less;
                }
                else {
                    lless.next = new ListNode(start.info);
                    lless = lless.next;
                }
            }
            start = start.next;
        }
        if (greater == null)  return less;
        lgreater.next = less;
        return greater;
    }
}

// Initialize four null pointers.
// Iterate through linked list with two scenarios: 1) if info is greater than key, then lgreater is set to the current
// node info.
// 2) If info is less than key, then lless is set to the current node info.
// Then continuously iterate through the linked list.
// Then we connect lgreater and lless to get the final order.
