

public class SelectionSortSS {
    public static void main(String[] args) {
        
   
        int []arr={2,1,5,7,3,4,10};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minposition=i;
            for(int j=i+1;j<n;j++){
                if(arr[minposition]>arr[j]){
                    minposition=j;
                }
                
            }
            int temp=arr[minposition];
                arr[minposition]=arr[i];
                arr[i]=temp;
        }
    }
}
