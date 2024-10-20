package Functions;

import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        int i=0;
        while(n>0){
            long LD=n%10;
            if(LD==1){
            ans = ans + (int)Math.pow(2, i);
            }
            n=n/10;
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
