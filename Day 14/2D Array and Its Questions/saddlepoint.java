public class saddlepoint {
    public static void main(String[] args) {
        int arr[][]={{2,4,6,8},{9,2,9,9},{8,5,6,7},{0,1,4,7}};
        saddle(arr);
    }

    static void saddle(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int min=0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][min]>arr[i][j]){
                    min=j;
                }
            }
            boolean flag = true;
            for(int k=0;k<arr.length;k++){
                if(arr[i][min]<arr[k][min]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("Saddle point: "+arr[i][min]);
            }
        }
    }
}
