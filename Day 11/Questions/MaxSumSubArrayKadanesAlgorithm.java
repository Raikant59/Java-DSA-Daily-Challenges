// This question is done by Kadanes Algorithm which say that if the Currentsum < 0 then Current will = 0 
// I also included the case of array in which all elements of an array is less than 0

public class MaxSumSubArrayKadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        kadanes(arr);
    }

    static void kadanes(int arr[]){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int csum=0;
        boolean it=false;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
               it=true;
            }else{
                it=false;
                break;
            }
        }

        for(int i=0;i<n;i++){
            if(it==false){
                csum=csum+arr[i];
                if(csum<0){
                    csum=0;
                }
                maxsum=Math.max(maxsum, csum);
            }else if(it==true){
                csum=arr[i];
                maxsum=Math.max(maxsum, csum);
            }
        }
        System.out.println("Max sum is: "+maxsum);
    }
}
