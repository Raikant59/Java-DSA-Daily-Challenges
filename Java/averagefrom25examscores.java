import java.util.*;
public class averagefrom25examscores {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;
        for(int i=0;i<25;i++){
            n=sc.nextInt();
            sum=sum+n;
        }
        int average = sum/25;
        System.out.println("The average is : "+average);
        sc.close();
    }
}
