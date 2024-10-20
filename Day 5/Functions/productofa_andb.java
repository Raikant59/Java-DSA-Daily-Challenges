package Functions;
import java.util.*;
public class productofa_andb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Product is : "+product(a, b));
        sc.close();
    }

    static int product(int a , int b){
        return a*b;
    }
    
}
