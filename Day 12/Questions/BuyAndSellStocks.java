public class BuyAndSellStocks {

    static int buysellprofit(int arr[]){
       int buy = Integer.MAX_VALUE;
       int maxprofit=0;

       for(int i=0;i<arr.length;i++){
              if(buy<arr[i]){
                int profit = arr[i] - buy;
                maxprofit = Math.max(profit, maxprofit);
              }else{
                buy=arr[i];
              }
       }
       return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int result = buysellprofit(arr);
        System.out.println("Maximum profit is : "+result);
    }
}
