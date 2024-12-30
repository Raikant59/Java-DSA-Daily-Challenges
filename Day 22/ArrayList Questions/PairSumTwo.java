// Question Link : - https://leetcode.com/problems/max-pair-sum-in-an-array/

// Solution : -

/*
   class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = i + 1 ; j < n ; j++ ) {
               if ( largest( nums[i] ) == largest( nums[j] ) ) {
                int sum = nums[i] + nums[j];
                maxsum = Math.max( sum , maxsum );
               }
            }
        }
        return maxsum > 0 ? maxsum : -1;
    }

    static int largest(int a){
        int max = Integer.MIN_VALUE;
        while ( a != 0 ) {
            int digit = a % 10;
            max = Math.max( max , digit);
            a = a / 10 ;
        }
        return max;
    }
}

 */
