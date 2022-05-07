package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        TreeNode temp = new TreeNode();
        while(!treeNodes.isEmpty()){
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                temp = treeNodes.poll();
                if(temp != null){
                    if(temp.left != null){
                        treeNodes.offer(temp.left);
                    }
                    if (temp.right != null){
                        treeNodes.offer(temp.right);
                    }
                }
            }
            if(temp != null){
                integers.add(temp.val);
            }
        }
        return integers;

    }

}
