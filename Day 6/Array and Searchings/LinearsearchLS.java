

public class LinearsearchLS {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int key = 4;
        int ans = Linearsearch(arr,key);
        if(ans==-1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element is present at index "+ans);
        }
    }
    static int Linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
       return -1;
    }
}
