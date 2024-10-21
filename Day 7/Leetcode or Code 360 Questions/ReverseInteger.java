// Question LINK :- https://leetcode.com/problems/reverse-integer/description/

// Solution:- 

/*
 
class Solution {
    public int reverse(int x) {
        int answer=0;
        while(x!=0){
            int digit=x%10;
            if(answer>(Integer.MAX_VALUE/10)||answer<(Integer.MIN_VALUE/10)){
                return 0;
            }
            answer=(answer*10)+digit;
            x=x/10;
        }
        return answer;
    }
}


 */
