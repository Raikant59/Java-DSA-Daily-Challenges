package Functions;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0 ;
        int i=0;
        while(n!=0){
            int digit = n%2;
            ans = digit*(int)Math.pow(10,i)+ans;
            n=n/2;
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
