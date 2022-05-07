package BinaryTree;

import java.util.*;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(lists);
        return lists;
    }
}
