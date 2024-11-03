/*
  This question can be solve using 3 approachs:-
  1. Basic Solution:- Using Linearly Search element
     Time complexity :- O(n^2)
  2. Row wise or Col wise Approach :- Using Binary search
     Time complexity :- O(nlog n);
  3. Staircase Search 
     Time complexity :- O(n+m);
 */
// System.out.println("Key is not found in the array");
//         System.out.println();


public class SearchinSortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target=33;
        usinglinear(arr, target);
        usingbinary(arr, target);
        usingstaircase(arr, target);
    }

    static void usinglinear(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key is found using linear search at index: "+i+","+j);
                    break;
                }
            }
        }
    }

    static void usingbinary(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            int s=0;
            int e=arr[0].length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[i][mid]==key){
                    System.out.println("Key is found using Binary search at index: "+i+","+mid);
                    break;
                }else if(key<arr[i][mid]){
                    e=mid-1;
                }else if(key>arr[i][mid]){
                    s=mid+1;
                }
            }
        }
    }

    static void usingstaircase(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("Key is found using Staircase search at index : "+row+","+col);
                break;
            }else if(key<arr[row][col]){
                col--;
            }else if(key>arr[row][col]){
                row++;
            }
        }
    }
}
