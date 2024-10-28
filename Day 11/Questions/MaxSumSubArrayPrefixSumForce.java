public class MaxSumSubArrayPrefixSumForce {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        MaxSum(arr);
    }

    static void MaxSum(int arr[]){
        int n = arr.length;
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    currentsum=prefix[j];
                }else{
                    currentsum=prefix[j]-prefix[i-1];
                }

                if(maxsum<currentsum){
                    maxsum=currentsum;
                }

            }
        }
        System.out.println("Max sum is : "+maxsum);
    }
}
