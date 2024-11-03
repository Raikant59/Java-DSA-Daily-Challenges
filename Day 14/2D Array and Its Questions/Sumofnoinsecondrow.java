public class Sumofnoinsecondrow {
    public static void main(String[] args) {
         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
         int result = issum(nums);
         System.out.println("The sum of element of 2 row is : "+result);
    }

    static int issum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum=sum+arr[1][i];
        }
        return sum;
    }
}
