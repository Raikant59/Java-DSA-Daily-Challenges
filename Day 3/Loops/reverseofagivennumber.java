public class reverseofagivennumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev=0;
        while(num>0){
            int LD = num%10;
            rev = (rev*10)+LD;
            num=num/10;
        }
        System.out.println(rev);
    }
}
