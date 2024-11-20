public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = findindex(arr,0,5);
        System.out.println(ans);
    }

    static int findindex(int arr[],int i,int key){
        if(i==arr.length-1 && arr[i]!=key){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findindex(arr, i+1, key);
    }
}
