import java.util.*;

public class LeafTrails {

    public String[] trails(TreeNode tree) {
        Map<Integer, String> myTreeMap = new TreeMap<>();
        leafTrails(tree, "", myTreeMap);
        String[] res = new String[myTreeMap.size()];
        int index = 0;
        for (int num : myTreeMap.keySet()){
            res[index] = myTreeMap.get(num);
            index += 1;
        }
        return res;
    }

    private void leafTrails(TreeNode tree, String curPath, Map<Integer, String> myTreeMap){
        if (tree == null) return;
        if (tree.left == null && tree.right == null){
            myTreeMap.put(tree.info, curPath);
            return;
        }
        leafTrails(tree.left, curPath + "0", myTreeMap);
        leafTrails(tree.right, curPath + "1", myTreeMap);
    }
}

// Prints out all the root to leaf paths in a given tree in sorted order.
// Utilizes a helper method leafTrails that recursive goes through the tree to build the string that shows the path.
// Every time we hit a leaf, we add it to myTreeMap with Integer as key and curPath string as value.
// In the main method, we convert myTreeMap values into a string array, then return the string array.