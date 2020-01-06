import java.util.*;

/** Returns a full binary tree */
public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null) return null;
        if (t.left == null && t.right == null) {
            return t;
        }
        if (t.left != null && t.right != null) {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
            return t;
        }
        // one child is null
        if (t.left != null) return tighten(t.left);
        return tighten(t.right);
    }
}

// If the pointer to the node does not have a left or right node, then return node.
// If both left and right are not null, then recursively call t.left and t.right to continue going through the tree.
// If the pointer points to the node that either has a left or right, but not both, then delete it by recursively
// calling recursively (e.g. if t.left != null then return tighten(t.left)).