

public class BubbleSortBS {
    public static void main(String []args){
        int []arr={2,1,5,7,3,4,10};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void bubblesort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

            }
        }
    }
}    

