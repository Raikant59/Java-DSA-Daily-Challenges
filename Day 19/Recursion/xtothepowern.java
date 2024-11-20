public class xtothepowern {
    public static void main(String[] args) {
        int x=5;
        int n=3;
        int result = xToThePowerOfN(x, n);
        System.out.println(result);
        int result1=optimizedcode(x, n);
        System.out.println(result1);
    }
    
    // Brute Force code
    static int xToThePowerOfN(int x,int n){
        if(n==1){
            return x;
        }
        int ans = x * xToThePowerOfN(x, n-1);
        return ans ;
    }

    // Optimized code 
    static int optimizedcode(int x,int n){
        if(n==1){
            return x;
        }
        int sq=optimizedcode(x, n/2)*optimizedcode(x, n/2);

        if(n%2!=0){
            return x*sq;
        }else{
            return sq;
        }
    }
}
