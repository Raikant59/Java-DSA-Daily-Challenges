import java.util.*;
public class rootsofquadraticequation {

    public static void main(String args[]){
        double a ;
        double b ;
        double c ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        a = sc.nextDouble();
        System.out.println("Enter the value of b");
        b = sc.nextDouble();
        System.out.println("Enter the value of c");
        c = sc.nextDouble();

        // calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // find the roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    

        sc.close();
      
     
    }
}

