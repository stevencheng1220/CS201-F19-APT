import java.util.*;

public class FindPath {
    private List<String> myList;

    public String path(TreeNode root, int target) {
        myList = new ArrayList<>();
        findPath(root, target, "");
        Collections.sort(myList);
        Collections.sort(myList, Comparator.comparing(String::length));
        if (myList.size() == 0) return "nopath";
        return myList.get(0);
    }

    private void findPath(TreeNode root, int target, String path){
        if (root == null) return;
        if (root.info == target) myList.add(path);
        findPath(root.left, target, path+"0");
        findPath(root.right, target, path+"1");
    }
}

// The helper method findPath creates a root to leaf path for each leaf node.
// The main method path sorts the ArrayList two ways - first alphabetically, then string length.
// Then we either return nopath or the first element in myList.