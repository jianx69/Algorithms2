package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValues {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(9);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        System.out.println(largestValues(treeNode) );
    }
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);

        while(!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode temp = treeNodes.poll();
                if (temp != null) {
                    ans = Math.max(temp.val, ans);
                    if (temp.left != null) {
                        treeNodes.offer(temp.left);
                    }
                    if (temp.right != null) {
                        treeNodes.offer(temp.right);
                    }
                }
            }
            result.add(ans);
        }
        return result;

    }
}
