public class reverseLL {
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
        }
        newNode.next = head;
        head = newNode;
    }

    static void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    static void addspecific(int data , int position){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        Node temp = head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    static void display(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        while( temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static int deletefirst(){
       if(size == 0){
        System.out.println("ll is empty");
        return -1;
       }else if(size == 1){
          int value = head.data;
          head = tail = null;
          size =0;
          return value;
       }
       int value = head.data;
       head = head.next;
       size --;
       return value;
    }

    static int deletelast(){
        if(size == 0){
         System.out.println("ll is empty");
         return -1;
        }else if(size == 1){
           int value = head.data;
           head = tail = null;
           size = 0;
           return value;
        }
        int value = tail.data;
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        temp.next=null;
        tail = temp;
        size --;
        return value;
     }

     // Reverse LinkedList 
     static void reverse(){
        Node curr = head;
        Node next=null;
        Node prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     }
    public static void main(String[] args) {
        addfirst(10);
        addfirst(5);
        addlast(20);
        display();
        addspecific(15, 2);
        display();
        System.out.println(size);
        reverse();
        display();
    }
}
