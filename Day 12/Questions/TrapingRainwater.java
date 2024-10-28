// Leetcode Question 
// Question name :- Traping rainwater type-hard

// Solution:- 

public class TrapingRainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int result = WaterLevel(arr);
        System.out.println("The total raining water trapped : "+result);
    }

    static boolean checkascending(int arr[]){
        boolean ascending = false;
        for(int i=0;i<arr.length-1;i++){
          if(arr[i]<arr[i+1]){
               ascending = true;
          }else{
             ascending=false;
             break;
          }
        }
        return ascending;
     }
 
     static boolean checkdescending(int arr[]){
         boolean descending = false;
         for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
                descending = true;
           }else{
             descending=false;
             break;
           }
           
         }
         return descending;
     }
 
     static int WaterLevel(int arr[]){
         int wl[]=new int[arr.length];
         int trappedwater =0;
         int width=1;
 
 
         int leftmax[]=new int[arr.length];
         leftmax[0]=arr[0];
 
         int rightmax[]=new int[arr.length];
         rightmax[arr.length-1]=arr[arr.length-1];
 
         if(arr.length<=2){
            trappedwater=0;
         }
         if(checkascending(arr)==true || checkdescending(arr)==true){
             trappedwater=0;
         }
         for(int i=1;i<arr.length;i++){
             leftmax[i]=Math.max(leftmax[i-1], arr[i]);
         }
         for(int i=arr.length-2;i>=0;i--){
             rightmax[i]=Math.max(rightmax[i+1], arr[i]);
         }
         for(int i=0;i<arr.length;i++){
             wl[i]=Math.min(leftmax[i], rightmax[i]);
         }
         for(int i=0;i<arr.length;i++){
             trappedwater=trappedwater+(wl[i]-arr[i])*width;
         }
         return trappedwater;
     }

}
 