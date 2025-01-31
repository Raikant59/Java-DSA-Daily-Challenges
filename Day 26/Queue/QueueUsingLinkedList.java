

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node rear = null;
        static Node front = null;
        static int size =0;
        
        static boolean isEmpty(){
            return size == 0;          
        }

        static void enqueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear = newNode;
                size++;
                return;
            }
            size++;
            rear.next = newNode;
            rear = newNode;
        }

        static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }else{
                size--;
                int front1 = front.data;
                if(rear == front){
                   rear = front = null;
                }
                front = front.next;
                return front1;
            }
        }

        static void print(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
            }
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        static int frontofQueue(){
            return front.data;
        }

        static int rearofQueue(){
            return rear.data;
        }
        
    }
    
    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
        System.out.println(qq.frontofQueue());
        System.out.println(qq.rearofQueue());
        qq.print();
        qq.Dequeue();
        qq.print();
    }
}
