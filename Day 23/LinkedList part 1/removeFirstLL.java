public class removeFirstLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    static void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if ( head == null ){
            head = tail = newNode ;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    static void display(){
        Node temp = head;
        if(head == null ){
            System.out.println("LL is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove First 
    static int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if ( size == 1 ){
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public static void main(String[] args) {
        addfirst(5);
        addfirst(2);
        addlast(6);
        addfirst(1);
        display();
        System.out.println(size);
        removeFirst();
        display();
    }
}
