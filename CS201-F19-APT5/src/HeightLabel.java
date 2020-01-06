import java.util.*;

public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        TreeNode ret = new TreeNode(0, rewire(t.left), rewire(t.right));
        int lh = 0;
        int rh = 0;
        if (ret.left != null) lh = ret.left.info;
        if (ret.right != null) rh = ret.right.info;
        ret.info = 1 + Math.max(lh, rh);
        return ret;
    }
}

// Recursively create a new tree with TreeNode ret.
// This is a depth first algorithm that starts at the most bottom node and increments upwards by taking the max of left
// and right node.