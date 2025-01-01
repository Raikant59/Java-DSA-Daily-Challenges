public class addfirstLL {
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

    static void addfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        addfirst(10);
        addfirst(20);
    }
}