/*
  -> It is a inbuilt function of java which give  a sorted array int the output.
        Syntax:- import java.util.Arrays;
                 Arrays.sort(#nameofarray);

  -> Time Complexity => O(nlogn)

  -> If we want to sort the array from a specific index to another index the we use:-
        Syntax:- Arrays.sort(array,fromIndex,toIndex);

 */

import java.util.Arrays;

public class InbuiltSortFunction {
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1,8};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
