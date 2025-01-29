public class ZigZagLL {
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

    static void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node solve(Node head){
        Node mid = getmid(head);

        Node right = mid.next;
        mid.next = null;
        Node curr=right;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        right = prev;
        Node temp = head;
        while(head!=null && right!=null){
            Node temp1 = head.next;
            Node temp2 = right.next;
            head.next = right;
            right.next = temp1;
            head = temp1;
            right = temp2;
        }
        return temp;
    }

    static Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        addlast(1);
        addlast(2);
        addlast(3);
        addlast(4);
        addlast(5);
        addlast(6);
        addlast(7);
        addlast(8);
        display();
        System.out.println();
        head = solve(head);
        display();
    }
}
