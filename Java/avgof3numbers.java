import java.util.*;
public class avgof3numbers {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();      
      int b=sc.nextInt();
      int c=sc.nextInt();
      int avg = (a+b+c)/3;
      System.out.println("Average of three numbers : "+avg);
      sc.close();
    }
}
