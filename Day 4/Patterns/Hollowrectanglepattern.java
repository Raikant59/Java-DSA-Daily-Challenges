package Patterns;

public class Hollowrectanglepattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
               if(j>=2 && j<=4 && i>=2 && i<=3){
                 System.out.print(" ");
               }else{
                System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}
