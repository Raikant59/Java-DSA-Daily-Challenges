import java.util.Scanner;

public class Billgst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        float totalcost = pencil+pen+eraser;
        float gst = totalcost*0.18f;
        float bill = totalcost+gst;
        System.out.println("Bill is: "+bill);
        sc.close();
    }
}
