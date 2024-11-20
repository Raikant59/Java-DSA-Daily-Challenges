public class Question2 {
    public static void main(String[] args) {
        int n=6;
        increorder(n);
    }

    static void increorder(int n){
        if(n==0){
            return;
        }
        increorder(n-1);
        System.out.println(n);
    }
}
