package Patterns;

public class zeroonetrianglepattern {
    public static void main(String[] args) {
        int n = 10;
        printTriangle(n);
    }
    static void printTriangle(int n){
           for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
             }
             System.out.println();
           }
    }
}
