public class DoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    // addfirst
    static void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addlast
    static void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode; 
    }

    // removefirst
    static void removefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // removelast
    static void removelast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        tail=tail.prev;
        tail.next = null;
    }

    // display
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        addfirst(10);
        addfirst(20);
        addlast(30);
        addlast(40);
        display();
        removefirst();
        display();
        removelast();
        display();
    }
}
