import java.util.Scanner;

public class InputOutputDeclaration {
    public static void main(String[] args) {
        // Declaration of String
        String name = "Raikant";

        // Input of String from the user
        String name1;
        Scanner sc = new Scanner(System.in);
        name1=sc.nextLine();
        
        //Output of String
        System.out.println(name);
        System.out.println(name1);
        sc.close();
    }
}
