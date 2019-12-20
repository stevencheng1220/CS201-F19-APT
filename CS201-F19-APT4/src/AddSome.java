import java.util.*;

public class AddSome {
    /** Iterative Method Only */
    public ListNode splice(ListNode list, int size){
        ListNode NEW = new ListNode(0);
        ListNode start = NEW;
        ListNode current = list;

        for (int i = 0; i < size; i += 1){
            NEW.next = new ListNode(current.info);
            current = current.next;
            NEW = NEW.next;
        }
        NEW.next = list;
        return start.next;
    }
}

// Have a for loop that iterates for the amount of nodes that the list will be duplicated for.
// Append existing list to the newly created list.