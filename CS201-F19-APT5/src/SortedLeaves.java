import java.util.*;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        List<String> myList = new ArrayList<String>();
        if (tree == null) return myList.toArray(new String[0]);

        convertLeaves(tree, myList);
        String[] res = myList.toArray(new String[myList.size()]);
        Arrays.sort(res);
        return res;
    }

    private void convertLeaves(TreeNode tree, List<String> myList){
        if (tree == null) return;
        if (tree.right == null && tree.left == null){
            char leaf = (char) tree.info;
            myList.add(Character.toString(leaf));
            return;
        }
        convertLeaves(tree.left, myList);
        convertLeaves(tree.right, myList);
    }
}

// Prints out all root node's info converted to ASCII character equivalents.
// Have a helper method that recursively goes through the tree and adds the value when a root node is found.
// In the main method, we convert the ArrayList into an array and sort it, then return it.