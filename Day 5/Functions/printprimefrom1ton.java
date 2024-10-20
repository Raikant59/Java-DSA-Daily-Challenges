package Functions;

import java.util.Scanner;

public class printprimefrom1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printprime(n);
        sc.close();
    }

    public static void printprime(int n){
        for(int i=2;i<=n;i++){
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                    }
                }
            if(flag==true){
                System.out.println(i);
            }
                        
        }
    }
}
