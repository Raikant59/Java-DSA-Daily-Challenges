public class SpiralMatrix {
    public static void main(String args[]){
        int arr[][]={
                     {1,2,3},
                     {5,6,7},
                     {9,10,11},
                    };
        int n=arr.length;
        int m=arr[0].length;
        printspiral(arr,n,m);            
    }

    static void printspiral(int arr[][],int n,int m){
        int sr=0; // Start row
        int er=n-1; // end row
        int sc=0; // Start column
        int ec=m-1; // end column

        while(sr<=er && sc<=ec){
            // top 
            for(int i=sc;i<=ec;i++){
                System.out.print(arr[sr][i]+" ");
            }

            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            
            //bottom
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][i]+" ");
            }

            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        System.out.println();
    }
}
