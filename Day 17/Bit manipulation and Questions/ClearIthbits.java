// Clear all bits which was back from ith position?
// Eg:- if n=1111 and i=2 then output will be 1100.

public class ClearIthbits {
    public static void main(String[] args) {
        System.out.println(Clearibits(14,2));
    }

    static int Clearibits(int n,int i){
        int bitmask=(-1)<<i;
        return n&bitmask;
    }
}
