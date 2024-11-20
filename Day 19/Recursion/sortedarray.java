public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5};
        boolean ans = sortedOrnot(arr,0);
        System.out.println(ans);
    }

    static boolean sortedOrnot(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedOrnot(arr,i+1);
    }
}
