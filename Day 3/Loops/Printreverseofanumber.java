import java.util.Scanner;

public class Printreverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int LD=n%10;
            System.out.print(LD);
            n=n/10;
        }
        sc.close();
    }
}
