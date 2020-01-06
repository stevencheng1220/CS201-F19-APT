import java.util.*;

public class LeafSum {
    public int sum(TreeNode t) {
        if (t == null) return 0;
        if (t.left == null && t.right == null) return t.info;
        return sum(t.left) + sum(t.right);
    }
}

// At the most bottom node, return tree info. Recursively call sum to t.left and t.right.