public class MaxSumSubArrayBruteForce {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        MaxSum(arr);
    }

    static void MaxSum(int arr[]){

        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=arr[k];
                    System.out.println(currentsum);
                }
                if(maxsum<currentsum){
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Maxsum is : "+maxsum);
    }
}
