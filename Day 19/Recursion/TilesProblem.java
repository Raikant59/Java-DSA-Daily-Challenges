public class TilesProblem {
    public static void main(String[] args) {
        System.out.println(getways(100));
    }

    static long getways(long n){
        if(n==0 || n==1){
            return 1;
        }
        return (long)(getways(n-1)+getways(n-2))%1000000007;
    }
}