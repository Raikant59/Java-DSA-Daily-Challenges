import java.util.Scanner;

public class studentispassorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalmarks =300;
        float marksstudentget=sc.nextInt();
        float fractionofmarks = marksstudentget/totalmarks;
        float percentage = fractionofmarks*100f;
        if(percentage>=33){
            System.out.println("Percentage of student : "+percentage);
            System.out.println("Student is pass");
        }else{
            System.out.println("Student is fail");
        }
        sc.close();
    }
}
