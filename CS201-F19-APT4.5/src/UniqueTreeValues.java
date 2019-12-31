import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        Set<Integer> list = new HashSet<Integer>();
        inOrder(root, list);
        int[] res = new int[list.size()];
        int i = 0;
        for (Integer num: list){
            res[i] = num;
            i += 1;
        }
        Arrays.sort(res);
        return res;
    }

    public void inOrder(TreeNode root, Set<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.info);
        inOrder(root.left, list);
        inOrder(root.right, list);
    }
}

// Have an inOrder helper method that adds each root.info into a HashSet.
// Convert HashSet into int array. Then sort the array and return.

