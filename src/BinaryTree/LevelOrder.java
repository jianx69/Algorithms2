package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while(!treeNodes.isEmpty()){
            int size = treeNodes.size();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = treeNodes.peek();
                if(temp != null){
                    integers.add(treeNodes.poll().val);
                    if(temp.left != null){
                        treeNodes.offer(temp.left);
                    }
                    if (temp.right != null){
                        treeNodes.offer(temp.right);
                    }
                }
            }
            lists.add(integers);
        }
        return lists;
    }
}
