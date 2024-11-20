public class Factorialofn {
    public static void main(String[] args) {
        int n=4;
        int ans=Factorialofnis(n);
        System.out.println("Factorial of "+n+" is "+ans+".");
    }

    static int Factorialofnis(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Factorialofnis(n-1);
    }
}
