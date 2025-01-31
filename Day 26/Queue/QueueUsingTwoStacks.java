import java.util.Stack;
public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int remove(){
            return s1.pop();
        }

        int peek1(){
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while (!q.isEmpty()) {
            System.out.println(q.peek1()+" ");
            q.remove();
        }
    }
}
