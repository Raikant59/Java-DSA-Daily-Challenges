// I done this question by both Recurion search and Iterative search.
// Time complexity  and Space complexity in iterative is O(n) & O(1) respectively;
// Time complexity  and Space complexity in recursive is O(n) & O(n) respectively;

public class searchAKey {
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

    //Add First
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

    //Add Last
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

    // Print 
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
            size=0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // remove last
    static int removelast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int value = head.data;
            head = tail = null;
            size=0;
            return value;
        }
        int value = tail.data;
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    // Iterative Search
    static int itrsearch(Node head,int key){
        Node temp = head;
        int i=0;
        while( temp!=null ){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    // Recursive Search
    static int recSearch(Node head, int key){
        if( size == 0 ){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index = recSearch(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }

    public static void main(String[] args) {
        addfirst(5);
        addfirst(2);
        addlast(6);
        addfirst(1);
        display();
        System.out.println(itrsearch(head, 2));
        System.out.println(recSearch(head, 2));
    }
}
