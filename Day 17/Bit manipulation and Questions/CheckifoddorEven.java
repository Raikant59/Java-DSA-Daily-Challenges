// If odd the LSB = 1
// If even the LSB = 0

public class CheckifoddorEven {
    public static void main(String args[]){
        int n=11;
        checkevenodd(n);
    }

    public static void checkevenodd(int n) {
        if((n & 1) == 1){
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }
    }
}
