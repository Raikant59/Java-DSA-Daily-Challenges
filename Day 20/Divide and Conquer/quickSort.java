public class quickSort {
    public static void main(String[] args) {
        int arr[]={1,3,1,5,8,4,11,9};
        int n=arr.length;
        quick(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void quick(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int pivotIndex1=partition(arr,s,e);
        quick(arr,s,pivotIndex1-1);
        quick(arr,pivotIndex1+1,e);
    }

    static int partition(int arr[],int s,int e){
        int pivot = arr[s];
        int count = 0 ;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = s + count ;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s]=temp;
        int i=s,j=e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i]<=pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
}
