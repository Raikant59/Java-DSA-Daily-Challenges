public class InsertionSortIS {
    public static void main(String[] args) {
        int []arr={2,1,5,7,3,4,10};
        insertionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int previous = i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
    }
}
