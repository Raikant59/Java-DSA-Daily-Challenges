// Time complexity :- O(logn).

public class countSetBits {
    public static void main(String[] args) {
        System.out.println(countsetbits(10));
    }

    static int countsetbits(int n){
        int count=0;
        while (n!=0) {
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
