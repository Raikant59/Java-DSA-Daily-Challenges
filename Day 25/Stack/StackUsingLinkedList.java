public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head = null;

        static boolean isEmpty(){
            return head==null;
        }

        static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        static int pop(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        static int peek(){
            return head.data;
        }

        static void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack ss= new stack();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        System.out.println(ss.peek()+" ");
        ss.print();
        System.out.println(ss.pop()+" ");
        ss.print();
    }
}
