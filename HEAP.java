
// import java.util.Comparator;
import java.util.*;

public class HEAP {

    static class student implements Comparable<student> {// jb hme classes ke andar priority define karni ho to hm
                                                         // implement karte h coprable interface ko
        String name;
        int rank;

        public student(String name, int rank) {

            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String args[]) {

        PriorityQueue<student> pq= new PriorityQueue<>();
        // PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());// make decending order
        // add in O(log N)
        // pq.add(3);
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);
        pq.add(new student("A",4));
        pq.add(new student("B",5));
        pq.add(new student("C",2));
        pq.add(new student("D",12));
        pq.add(new student("E",13));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " ->"+pq.peek().rank+ " ");// proirity queue by default give ascending order because it give more
                                              // priority to the low integer value
            pq.remove();

        }

    }

}
