import java.util.*;

public class AllPaths {
    private ArrayList<String> myList = new ArrayList<>();

    public String[] paths(TreeNode t) {
        pathCreator(t, "");
        String[] res = myList.toArray(new String[myList.size()]);
        Arrays.sort(res);
        for (int i = 0; i < res.length; i += 1){
            String cur = res[i].substring(2);
            res[i] = cur;
        }
        return res;
    }

    private void pathCreator(TreeNode t, String curPath){
        if (t == null) return;
        if (t.left == null && t.right == null){
            myList.add(curPath + "->" + Integer.toString(t.info));
            return;
        }
        pathCreator(t.left, curPath + "->" + Integer.toString(t.info));
        pathCreator(t.right, curPath + "->" + Integer.toString(t.info));
    }
}

// Prints out all the root to leaf paths in a given tree.
// Utilizes a helper method pathCreator that recursive goes through the tree to build the string that shows the path.
// Every time we hit a leaf, we add it to a global arrayList myList.
// In the main method, we convert the list into a string array, then sort the values.
// Then we modify each path by removing the root from each path, then return the array.