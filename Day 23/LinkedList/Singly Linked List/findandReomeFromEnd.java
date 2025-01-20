public class findandReomeFromEnd {
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
        if(head == null){
            head = tail = newNode;
            return;
        } 
        newNode.next = head;
        head = newNode;
    }

    static void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    static void display(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Remove from end Method 
    static void removefromEnd(int n){
        if(size == n){
            head = head.next;
            return;
        }

        int i=1;
        int index = size -n;
        Node prev = head;
        while(i<index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        addfirst(10);
        addlast(20);
        addfirst(5);
        addlast(25);
        display();
        removefromEnd(4);
        display();
    }
}
