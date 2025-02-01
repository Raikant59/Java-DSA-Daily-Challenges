import java.util.*;
public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> q = new LinkedList<>();

        boolean isEmpty(){
            return q.isEmpty();
        }
        
        void add(int x){
            q.addLast(x);
        }

        int remove(){
            if(q.isEmpty()){
                return -1;
            }
            return q.removeFirst();
        }

        int peek(){
            if(q.isEmpty()){
                return -1;
            }
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek()+" peek element");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
