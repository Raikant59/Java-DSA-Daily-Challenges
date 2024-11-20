public class fibonacci {
    public static void main(String[] args) {
        int n = 25;
        int ans = fibois(n);
        System.out.println(ans);
    }

    static int fibois(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibois(n-1)+fibois(n-2);
    }
}

// Time complexity = exponential (O(2^n)).
// Space complexity = O(n).