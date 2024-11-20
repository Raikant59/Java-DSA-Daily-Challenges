public class sumoffirstnnaturalnumbers {
    public static void main(String[] args) {
        int n = 5;
        int ans = sumis(n);
        System.out.println("Sum of first " + n + " natural numbers is " + ans+".");
    }

    static int sumis(int n){
        if(n==1){
            return 1;
        }
        return n+sumis(n-1);
    }
}
