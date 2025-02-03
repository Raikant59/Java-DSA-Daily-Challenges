public class HeapSort {

    static void heafify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int manidx = i;

        if(left < size && arr[manidx] < arr[left]){
            manidx = left;
        }
        if(right < size && arr[manidx] < arr[right]){
            manidx = right;
        }

        if(manidx != i){
            int temp = arr[i];
            arr[i] = arr[manidx];
            arr[manidx] = temp;

            heafify(arr, manidx, size);
        }
    }
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
             heafify(arr,i,n);
        }

        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heafify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
