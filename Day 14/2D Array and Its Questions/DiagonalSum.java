public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        int result1=sumofdiagonal(arr); 
        int result2=sumofdiagnoalO(arr);  
        System.out.println();
        System.out.println("Sum of Diagonal using Brute Force approach:- "+result1);  
        System.out.println("Sum of Diagonal using Optimized Solution:- "+result2);    
        System.out.println();     
    }       
    


    // Brute force approach with Time complexity :- O(n^2)
    static int sumofdiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                   sum=sum+arr[i][j];
                }else if(i+j==arr.length-1){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized Solution with Time complexity :- O(n)

    static int sumofdiagnoalO(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];
            if(i!=arr.length-i-1){
                sum=sum+arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    
}
