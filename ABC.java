import java.util.*;

class ABC {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : arr) {
            pq.add(n);
        }
        
        System.out.println(pq.peek());
    }
}

