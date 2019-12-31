import java.util.*;

public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        if (list == null || list.next == null){
            return list;
        }
        ListNode first = list;

        while (list.next != null) {
            ListNode temp = list;
            if (list.next.info == temp.info) {
                list.next = list.next.next;
            }
            else {
                list = list.next;
            }
        }
        return first;
    }
}

// Have a while loop that iterates through the list. If adjacent nodes are equal, only keep one of them.
// We do not have to store unique variables in a HashSet because the list is sorted, so identical values will be
// adjacent to one another.