import java.util.*;

public class ListStretch {
    /** Iterative method */
    public ListNode stretch (ListNode list, int amount){
        ListNode first = list;
        while (list != null){
            for (int i = 1; i < amount; i += 1) {
                list.next = new ListNode(list.info, list.next);
                list = list.next;
            }
            list = list.next;
        }
        return first;
    }

    /** Recursive method */
    public ListNode stretch (ListNode list, int amount) {
        if (list == null) return null;
        list.next = stretch(list.next, amount);
        for (int i = 1; i < amount; i += 1) {
            list = new ListNode(list.info, list);
        }
        return list;
    }
}

// Duplicates each node by a factor of int amount.
// Iterative method utilizes a for loop within the main while loop that generates new nodes.
// Recursive method utilizes a recursive call to call stretch(list.next, amount). However, the creation of listNodes
// is still a iterative for loop. The while loop is simply replaced by the recursive call.
