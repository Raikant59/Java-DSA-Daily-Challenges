// Question Link :- https://www.naukri.com/code360/problems/reverse-the-array_1262298?interviewProblemRedirection=true&attempt_status=COMPLETED

// Solution:- 

    /*


      import java.util.* ;
      import java.io.*; 
      import java.util.ArrayList;

      public class Solution
      {
        public static void reverseArray(ArrayList<Integer> arr, int m)
          {
             int start = m+1;
             int end = arr.size()-1;
             while(start<=end){
             int tem=arr.get(start);
             arr.set(start,arr.get(end));
             arr.set(end,tem);
             start++;
             end--;
            }
         }
      }


    */