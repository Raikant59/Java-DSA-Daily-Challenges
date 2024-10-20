import java.util.Scanner;

public class Temperaturefever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature in Fahrenheit");
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");
        }
        sc.close();
    }
}
