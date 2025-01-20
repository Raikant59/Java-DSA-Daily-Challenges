

public class DetectAndRemoveCycleinLL {
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

    static void DetectAndRemoveCycle(){
        Node slow = head;
        Node fast = head;
        boolean istrue = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                istrue = true;
                break;
            }
        }
        if(istrue == false){
            return;
        }
        slow = head;
        Node prev=null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next=null;
    }

    static void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(5);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        DetectAndRemoveCycle();
        display();
    }
}
