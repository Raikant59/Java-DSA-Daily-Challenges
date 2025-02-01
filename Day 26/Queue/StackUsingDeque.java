import java.util.*;
public class StackUsingDeque {
    static class Stack{
       Deque<Integer> q = new LinkedList<>();

       void push(int data){
         q.addFirst(data);
       }

       int pop(){
         return q.removeFirst();
       }

       int peek(){
        return q.getFirst();
       }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.peek()+" peek element");
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
