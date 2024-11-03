public class checknumberispowerof2ornot {
    public static void main(String[] args) {
        check2(2);
    }

    static void check2(int n){
        if((n&(n-1))==0){
            System.out.println("Yes,"+n+" is a power of 2.");
        }else{
            System.out.println("No,"+n+" is not power of 2.");
        }
    }
}
