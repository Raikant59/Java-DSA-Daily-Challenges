import java.util.Scanner;

public class Writeaprogramthatreadsasetofintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum=evensum+i;
            }else{
                oddsum=oddsum+i;
            }
        }
        System.out.println("Sum of even numbers : "+evensum);
        System.out.println("Sum of odd numbers : "+oddsum);
        sc.close();
    }
}
