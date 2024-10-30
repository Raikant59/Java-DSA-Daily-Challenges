import java.util.Scanner;

public class Creationof2darray {
    public static void main(String[] args) {
        int arr[][]=new int[4][3];
        Scanner sc = new Scanner(System.in);

        // Input
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
               arr[i][j]=sc.nextInt();
            }
        }

        //Output
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
