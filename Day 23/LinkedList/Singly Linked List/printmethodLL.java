public class printmethodLL {

    static class Node {
        int data;
        Node next;
        Node( int data ) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    static void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static void addlast(int data ) {
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    static void display(){
        Node temp = head;
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        while( temp!=null ){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addfirst(20);
        addfirst(10);
        addlast(30);
        addlast(40);
        display();
    }
}
