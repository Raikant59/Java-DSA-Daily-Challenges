/* Question:- Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity.
*/

public class returnindexorminusone {

    static int checknum(int arr[],int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(arr[mid]==target){
                 return mid;
            }else if(arr[mid]<target){
                 start=mid+1;
            }else if(arr[mid]>target){
                 end = mid-1;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,9,10};
        int target = 8;
        int result = checknum(arr,target);
        System.out.println("Index of target element is : "+result);
    }
}
