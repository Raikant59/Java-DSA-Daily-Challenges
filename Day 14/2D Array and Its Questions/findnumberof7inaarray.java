public class findnumberof7inaarray {
    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        int result = countof7(array);
        System.out.println("The number of 7's in the array:- "+result);
    }

    static int countof7(int arr[][]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
}