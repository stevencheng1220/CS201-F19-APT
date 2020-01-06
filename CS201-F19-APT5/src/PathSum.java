import java.util.*;

public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree == null) return 0;
        if (tree.left == null && tree.right == null) {
            if (target == tree.info) return 1;
            return 0;
        }
        int left = hasPath(target-tree.info,tree.left);
        int right = hasPath(target-tree.info,tree.right);
        if (left == 1 || right == 1) return 1;
        return 0;
    }
}

// First two if statements are base cases.
// Recursively set left and right value to check the left and right tree respectively.
// Return 1 if left or right is equal to 1, else return 0.





