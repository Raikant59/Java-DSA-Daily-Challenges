public class SpraseMatrix {
    public static void main(String[] args) {
        int mat[][]={{0,0,3},{1,0,0},{0,5,0}};
        sprase(mat);   
    }

    static void sprase(int arr[][]){
      int size=0;  
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]!=0){
                size++;
            }
        }
      }
      int ans[][]=new int[3][size];
      int k=0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]!=0){
                ans[0][k]=i;
                ans[1][k]=j;
                ans[2][k]=arr[i][j];
                k++;
            }
        }
      }
      for(int i=0;i<3;i++){
        for(int j=0;j<size;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
      }
    }
}
