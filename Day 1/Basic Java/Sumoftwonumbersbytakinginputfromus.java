import java.util.*;


public class Sumoftwonumbersbytakinginputfromus {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b = sc.nextInt();
       int sum = a+b;
       int product=a*b;
       System.out.println("Sum of two numbers is: "+sum);
       System.out.println("Product of two numbers is: "+product);
       sc.close();
    }
}
