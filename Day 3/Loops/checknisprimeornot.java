import java.util.Scanner;

public class checknisprimeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean prime = true;
        if(n>1){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    prime=false;
                }
            }
            if(prime==true){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
}
