import java.util.PriorityQueue;

public class heapNEARBYCARS {
    static class point implements Comparable<point> {
        int x;
        int y;
        int distsqure;
        int idx;

        public point(int x, int y, int distsqure, int idx) {

            this.x = x;
            this.y = y;
            this.distsqure = distsqure;
            this.idx = idx;
        }

        @Override
        public int compareTo(point p2) {// compar e to ke andar agar koi dusra point aata h to value distance ke basis
                                        // par sort honi chahiye
            return this.distsqure - p2.distsqure;

        }

        public static void main(String args[]) {
            int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
            int k = 2;

            PriorityQueue<point> pq = new PriorityQueue<>();
            for (int i = 0; i < pts.length; i++) {
                int distsqure = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
                pq.add(new point(pts[i][0], pts[i][1], distsqure, i));
            }
            // nearest k cars
            for (int i = 0; i < k; i++) {
                System.out.println("C " + pq.remove().idx);

            }

        }

    }

}
