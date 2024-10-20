import java.util.*;
public class areaofcircle{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r= read.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("The area of the circle is "+area);
        read.close();
    }
}