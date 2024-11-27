public class printAllBinaryStrings {
    public static void main(String[] args) {
        int n=3;
        printAllBinaryString(n,1, "");
    }

    static void printAllBinaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printAllBinaryString(n-1, 1, str+"1");
        if(lastplace==1){
            printAllBinaryString(n-1, 0, str+"0");
        }
    }
}
