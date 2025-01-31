public class QueueUsingArray {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        } 

        static boolean isEmpty(){
            return rear == -1;
        }

        static void enqueue(int data){
            if(rear == size -1){
                System.out.println(" Queue is full");
                return;
            }
            arr[++rear]=data;
        }

        static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            size--;
            rear = rear - 1;
            return front;
        }

        static int peek(){
            return arr[0];
        }

        static void print(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue(5);
        qq.enqueue(5);
        qq.enqueue(10);
        qq.enqueue(15);
        qq.enqueue(20);
        qq.enqueue(25);
        qq.print();
        System.out.println(qq.Dequeue()+" remove from queue");
        System.out.println(qq.peek());
        qq.print();
    }
}
