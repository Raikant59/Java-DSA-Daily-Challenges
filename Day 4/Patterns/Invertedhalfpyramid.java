package Patterns;

public class Invertedhalfpyramid {
    
    public static void main(String[] args){
        int n=5;
        printpattern(n);
     }
 
     static void printpattern(int n){
        for (int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
             System.out.print(j);
         }
         for(int j=1;j<=i-1;j++){
             System.out.print(" ");
         }
         System.out.println();
        }
     }
}
