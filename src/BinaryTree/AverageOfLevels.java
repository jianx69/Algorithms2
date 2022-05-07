package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> integers = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        TreeNode temp = new TreeNode();
        double sum = 0;
        double count = 0;
        while(!treeNodes.isEmpty()){
            int size = treeNodes.size();
            count = 0;
            sum = 0;
            for (int i = 0; i < size; i++) {
                temp = treeNodes.poll();
                if(temp != null){
                    sum += temp.val;
                    count++;
                    if(temp.left != null){
                        treeNodes.offer(temp.left);
                    }
                    if (temp.right != null){
                        treeNodes.offer(temp.right);
                    }
                }
            }
            integers.add(sum / count);

        }
        return integers;
    }
}
