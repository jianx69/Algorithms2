package BinaryTree;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    List<Integer> v = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return v;
        }
        v.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return v;
    }
}
