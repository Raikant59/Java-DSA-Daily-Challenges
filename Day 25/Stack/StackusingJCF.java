import java.util.Stack;
public class StackusingJCF {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        System.out.println(ss.peek()+" peek element ");
        System.out.println(ss.pop()+" pooped from stack ");
        while(!ss.isEmpty()){
            System.out.print(ss.peek()+" ");
            ss.pop();
        }
    }
}
