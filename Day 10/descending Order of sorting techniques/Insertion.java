public class Insertion {
    public static void main(String[] args) {
        int arr[]={4,2,7,5,1,9};
        InsertionI(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void InsertionI(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current = arr[i];
            int previous = i-1;
            while(previous >=0 && arr[previous]<current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
    }
}
