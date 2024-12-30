// Question Link :- https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/

// Solution : -

/*
   class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0; 
        int j = n - 1;
        int maxsum = Integer.MIN_VALUE;
        while ( i < j ) {
            int sum = nums[i] + nums[j];
            maxsum = Math.max( maxsum , sum );
            i++;
            j--;
        }
        return maxsum;
    }
} 

 */
