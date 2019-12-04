import java.util.*;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {
        int crosses = 0;
        for (int i = 0; i < x.length; i += 1){
            boolean first = isInside(x1,y1,x[i],y[i],r[i]);
            boolean second = isInside(x2,y2,x[i],y[i],r[i]);
            if (first != second){
                crosses += 1;
            }
        }
        return crosses;
    }

    private boolean isInside(int x, int y, int cx, int cy, int r){
        double dist = Math.sqrt((x-cx)*(x-cx)+(y-cy)*(y-cy));
        return dist < r;
    }
}

// Iterate through each coordinate and check whether the start point and end point are in a circle or not.
// if the start and end point have different booleans (aka a point is within a circle), then this means that there is a
// border and we must increment crosses.