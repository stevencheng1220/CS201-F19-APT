import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        List<Integer> results = new ArrayList<>();
        int i = 0;
        while (i < list.length){
            if (i == list.length-1) {
                results.add(list[i]);
                break;
            }
            int total = list[i] + list[i+1];
            results.add(total);
            i += 2;
        }
        int[] ret = new int[results.size()];
        Iterator<Integer> iterator = results.iterator();
        for (int j = 0; j < ret.length; j+=1){
            ret[j] = iterator.next().intValue();
        }
        return ret;
    }
}

// Sums up adjacent pairs of integers. If the list size is odd, this code adds the last index in as itself.
// Convert the result Arraylist into an int array.
