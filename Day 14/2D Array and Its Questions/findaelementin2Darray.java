public class findaelementin2Darray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{4,5,7,6},{8,5,9,2}};
        int target=7;
        findindex(arr,target);
    }

    static void findindex(int arr[][],int target){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    System.out.println("Element "+arr[i][j]+" is found at index "+"("+i+","+j+")");
                }
            }
        }
    }
}