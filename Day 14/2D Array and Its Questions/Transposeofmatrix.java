public class Transposeofmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        transposem(arr);
    }

    static void transposem(int arr[][]){
        int transpose[][]=new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 transpose[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
