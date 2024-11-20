public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 5,5};
        int ans = findindex(arr,arr.length-1,3);
        System.out.println(ans);
    }

    static int findindex(int arr[],int i,int key){
       if(i==0 && arr[i]!=key){
            return -1;
       }
       if(arr[i]==key){
        return i;
       }
       return findindex(arr,i-1,key);
    }
}
