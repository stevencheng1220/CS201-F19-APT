import java.util.*;

public class TreeCount{
    public int count(TreeNode tree){
        if (tree == null) return 0;
        return 1 + count(tree.right) + count(tree.left);
    }
}

// Counts the number of nodes within a tree by recursively calling 1 + left + right.