import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side *side;
        System.out.println("Area of square is: "+area);
        sc.close();
    }
}
