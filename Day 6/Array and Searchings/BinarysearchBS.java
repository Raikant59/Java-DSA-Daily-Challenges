

public class BinarysearchBS {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target = 6;
        int result = binarySearch(arr, target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is present at index: "+result);
        }
    }
    static int binarySearch(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }else if (arr[mid]<key){
                start = mid +1;

            }else if(arr[mid]>key){
                end = mid -1;
            }
        }
        return -1;
    }
}
