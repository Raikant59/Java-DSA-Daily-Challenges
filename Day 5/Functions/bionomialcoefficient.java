package Functions;
import java.util.*;
public class bionomialcoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        calculatebionomialcoeffiecient(n, r);
        sc.close();
    }

    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
               fact=fact*i;
        }
        return fact;
    }

    public static void calculatebionomialcoeffiecient(int n,int r){
        int numerator=factorial(n);
        int deno1=factorial(r);
        int deno2=factorial(n-r);
        int denominator = deno1*deno2;
        int result = numerator/denominator;
        System.out.println("Bionomial coefficient is : "+result);
    }
}
