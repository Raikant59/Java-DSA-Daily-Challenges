public class thegreatestfrom2numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = findMax(a, b);
        System.out.println("The greatest number is " + max);

        
    }
    static int findMax(int a,int b){
             if(a>b){
                return a;
             }else{
                return b;
             }
    }
}
