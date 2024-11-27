public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
        int target = 0;
        int result = search(arr, target, 0, arr.length-1);
        System.out.println("Index of target element is: " + result);
    }
    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(arr[s]<=target &&target<=arr[mid]){
                return search(arr, target, s, mid-1);
            }else{
                return search(arr, target, mid+1, e);
            }
        }else{
            if(arr[mid]<=target && target<=arr[e]){
                return search(arr, target, mid+1, e);
            }else{
                return search(arr, target, s, mid-1);
            }
        }
    }
}
