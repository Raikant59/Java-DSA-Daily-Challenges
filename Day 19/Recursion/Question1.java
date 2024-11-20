import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        recursivefunction(n);
        sc.close();
    }

    static void recursivefunction(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        recursivefunction(n-1);
    }
}