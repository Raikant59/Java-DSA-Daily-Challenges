import java.util.ArrayList;
public class StackUsingArrayList {
    static class stack{
        static ArrayList<Integer> arr = new ArrayList<>();

        static boolean isEmpty(){
            return arr.size() ==0;
        }

        static void push(int x){
            arr.add(x);
        }

        static int peek(){
            int top = arr.get(arr.size()-1);
            return top;
        }

        static int pop(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                int x = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                return x;
            }
        }

        static void print(){
            for(int i=arr.size()-1;i>-1;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println( s.pop()+" popped from stack");
        s.print();
        s.push(50);
        s.print();
        System.out.println(s.pop()+" popped from stack");
        s.print();
    }
}
