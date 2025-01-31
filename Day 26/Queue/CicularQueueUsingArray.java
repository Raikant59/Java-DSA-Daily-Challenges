public class CicularQueueUsingArray {
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        CircularQueue(int n){
            arr=new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        boolean isfull(){
            return (rear + 1)%size == front;
        }

        boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        int peek(){
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}
