package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderN {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node temp = treeNodes.peek();
                if (temp != null) {
                    integers.add(treeNodes.poll().val);
                    List<Node> children = temp.children;
                    for (int j = 0; j < children.size(); j++) {
                        treeNodes.offer(children.get(j));
                    }
                }
            }
            result.add(integers);
        }
        return result;
    }
}
