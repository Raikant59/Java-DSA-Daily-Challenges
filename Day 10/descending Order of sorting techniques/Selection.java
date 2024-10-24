public class Selection {
    public static void main(String[] args) {
        int arr[]={4,2,7,5,1,9};
        SelectionS(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void SelectionS(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minposition=i;
            for(int j=i+1;j<n;j++){
                if(arr[minposition]<arr[j]){
                    minposition=j;
                }
                // swap
                int temp=arr[i];
                arr[i]=arr[minposition];
                arr[minposition]=temp;
            }
        }
    }
}
