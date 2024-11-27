public class friendPairingProblem {
    public static void main(String[] args) {
        int n=3;
        int ans = friendpairing(n);
        System.out.println(ans);
    }


    static int friendpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }
}
