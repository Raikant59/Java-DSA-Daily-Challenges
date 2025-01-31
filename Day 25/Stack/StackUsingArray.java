public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println( s.pop()+" popped from stack");
        s.print();
    }
}

class Stack{
    public static int Max = 1000;
    int top;
    int arr[]=new int[Max];

    Stack(){
        top = -1;
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean push(int x){
        if(top >= (Max-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            arr[++top]=x;
            System.out.println(x+" pushed into Stack");
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }

    int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = arr[top];
            return x;
        }
    }

    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
