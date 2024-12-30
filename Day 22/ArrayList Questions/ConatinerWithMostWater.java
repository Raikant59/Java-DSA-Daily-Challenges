// Question Link :- https://leetcode.com/problems/container-with-most-water/description/

// Solution:- 
/*
  class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxwater = Integer.MIN_VALUE;
        while(i<j){
            int minh= Math.min(height[i],height[j]);
            int width = j - i;
            int water = minh * width ;
            maxwater = Math.max( maxwater , water );
            if( height[i] < height[j] ){
                i++;
            }else {
                j--;
            }
        }
        return maxwater;
    }
}
*/
