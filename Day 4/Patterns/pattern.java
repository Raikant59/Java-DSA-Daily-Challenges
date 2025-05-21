package Patterns;
public class pattern {
    public static void main(String args[]){
        int n=12;
        int k=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              if(k<=sum){  
              if(k%2==0){
                System.out.print("0 ");
              }else{
                System.out.print("1 ");
              }
              k++;
            }
            }
            System.out.println();
        }
    }
}
