public class addSpecificPosition {
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

    // Addfirst
    static void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Addlast
    static void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // At any specific Position
    static void addmiddle(int data,int position){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<position-1){
           temp=temp.next;
           i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty LL");
            return;
        }
        while( temp != null ){
           System.out.print(temp.data+" -> ");
           temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        display();
        addfirst(10);
        addfirst(5);
        addlast(20);
        display();
        addmiddle(15, 2);
        display();
    }
}
