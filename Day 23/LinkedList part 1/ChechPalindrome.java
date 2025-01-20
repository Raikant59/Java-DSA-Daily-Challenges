public class ChechPalindrome {

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
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean palindrome(){
        if(head == null || head.next==null){
           return true;
        }

        Node mid = findmid(head);
        
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next; 
        }
        return true;
    }
    public static void main(String[] args) {
        addfirst(2);
        addfirst(3);
        addfirst(5);
        addfirst(3);
        addfirst(2);
        System.out.println(palindrome());
    }
}