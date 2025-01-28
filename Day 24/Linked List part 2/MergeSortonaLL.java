public class MergeSortonaLL {
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
    
        static Node solve(Node head){
    
            if(head == null || head.next == null){
                return head;
            }
    
            Node mid = getmid(head);
            Node righthead = mid.next;
            mid.next = null;

            Node left = solve(head);
            Node right = solve(righthead);
    
            return merge(right,left);
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
    
        static Node merge(Node right , Node left){
            Node node1 = left;
            Node node2 = right;
            
            Node temp = new Node(-1);
            Node node3 = temp;
            while(node1 != null && node2 !=null){
                if(node1.data <= node2.data){
                    node3.next = node1;
                    node3=node3.next;
                    node1=node1.next;
                }else{
                    node3.next = node2;
                    node3=node3.next;
                    node2=node2.next;
                } 
            }
            while(node1 != null){
                node3.next = node1;
                node3=node3.next;
                node1=node1.next;
            }
            while(node2 != null){
                node3.next = node2;
                node3=node3.next;
                node2=node2.next;
            }
            return temp.next;
        }
    
        static void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            addlast(8);
            addfirst(3);
            addfirst(11);
            addfirst(9);
            addfirst(5);
            display();
            head = solve(head);
            display(); 
        }
    }
    

