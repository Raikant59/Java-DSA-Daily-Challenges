package Functions;

import java.util.Scanner;

public class optimizeprimenumbercode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkprime(n);
        sc.close();
    }
    public static void checkprime(int n){
         boolean isPrime = true;
         for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                isPrime = false;
            }
         }
         if(isPrime){
            System.out.println(n+" is a prime number");
         }else{
            System.out.println(n+" is not a prime number");
         }
    }
}
