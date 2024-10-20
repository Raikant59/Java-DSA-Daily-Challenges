import java.util.Scanner;

public class sumoffirstnnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int j=1;j<=n;j++){
            sum =sum+j;
        }
        System.out.println("The sum is : "+sum);
        sc.close();
    }
}
