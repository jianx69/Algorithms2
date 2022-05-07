package stackandqueue;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> v = new HashMap<>();
        for (int num : nums) {
            v.put(num, v.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        Set<Map.Entry<Integer, Integer>> entries = v.entrySet();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        for(Map.Entry<Integer, Integer> entry : entries){
            queue.offer(entry);
            if(queue.size() > k){
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0 ; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;


    }
}
