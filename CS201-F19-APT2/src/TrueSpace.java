import java.util.*;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long total = 0;
        for (int num : sizes){
            total += clusterSize * Math.ceil((double) num/clusterSize);
        }
        return total;
    }
}

// Iterate through sizes, and add to total the clusterSize multiplied by the minimum amount of clusters required to
// completely encompass the element.