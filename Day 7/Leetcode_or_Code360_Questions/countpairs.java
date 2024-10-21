// Question Link :- https://www.naukri.com/code360/problems/count-pairs_3844022?interviewProblemRedirection=true&attempt_status=ATTEMPTED

// Solution:- 

/*


 import java.util.* ;
import java.io.*; 

public class Solution {
    static int countPairs(int a[], int n, int x, int y, int sum) {
     
        int count =0;
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
               if(a[i]*x+a[j]*y==sum){
                   count++;
               }
          }
        }
        return count;
    }
}


 */

 // Note :- This solution is not optimized solution. We will optimize this solution by using hashmap when we learn the concept of hashmap.