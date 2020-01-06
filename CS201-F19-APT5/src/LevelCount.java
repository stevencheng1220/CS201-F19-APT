import java.util.*;

public class LevelCount {
    public int count(TreeNode t, int level) {
        if (t == null) return 0;
        if (level == 0) return 1;
        int res = count(t.left,level-1) + count(t.right,level-1);
        return res;
    }
}

// Recursive solution where we decrement level as we go down the tree. We only count the number of nodes if int level
// is equal to 0.
