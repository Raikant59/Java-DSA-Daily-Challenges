import java.util.Scanner;

public class displayallnumbersuserenterexceptmultiplesof10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
             int num=sc.nextInt();
             if(num%10==0){
                System.out.println("multiple of 10");
                continue;
             }else{
                System.out.println(num);
             }
             sc.close();
        }
    }
}
