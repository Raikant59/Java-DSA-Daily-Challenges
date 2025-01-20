// Question link :- https://www.naukri.com/code360/problems/cycle-detection-in-a-singly-linked-list_628974?interviewProblemRedirection=true&search=detect&attempt_status=COMPLETED


/*
   Solution :- 
   
    public class Solution {

    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

 */