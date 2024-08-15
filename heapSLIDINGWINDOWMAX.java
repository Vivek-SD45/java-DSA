import java.util.*;

public class heapSLIDINGWINDOWMAX {
    // jab bhi hme ek jyada cheez store karani ho to unhe hm class ki form store
    // karate h
    static class pair implements Comparable<pair> {// O(nlogn)

        int value;
        int idx;

        public pair(int value, int idx) {

            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(pair p2) {
            // ascendong order m sort karna hota
            // return this.value-p2.value;
            // but we want decending order
            return p2.value - this.value;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, -1, -3, 5 };
        int k = 3;
        int res[] = new int[arr.length - k + 1];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        // Ist window
        for (int i = 0; i < k; i++) {
            pq.add(new pair(arr[i], i));

        }
        res[0] = pq.peek().value;
        for (int i = 0; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            res[i - k + 1] = pq.peek().value;// result of next window

        }
        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
        System.out.println();
    }

}
