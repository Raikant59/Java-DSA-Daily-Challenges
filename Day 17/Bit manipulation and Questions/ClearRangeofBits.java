public class ClearRangeofBits {
    public static void main(String[] args) {
        System.out.println(clearRange(10,2,7));
    }
    
    static int clearRange(int n,int i,int j){
        int a=(-1)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
}