import java.util.*;
public class DequeUsingJCF {
    public static void main(String[] args) {
        Deque<Integer>  q = new LinkedList<>();
        q.addFirst(10);
        q.addLast(20);
        System.out.println(q);
    }
}

// You can also use other inbuilt function of Deque like removefirst,removelast,getfirst,getlast etc.