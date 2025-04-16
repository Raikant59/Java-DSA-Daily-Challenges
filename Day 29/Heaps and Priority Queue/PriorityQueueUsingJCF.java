import java.util.*;;

public class PriorityQueueUsingJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(11);
        pq.add(15);
        pq.add(1);
        pq.add(18);
        pq.add(23);
        pq.add(40);
        pq.add(4);
        pq.add(7);
        pq.add(2);
        pq.add(21);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
