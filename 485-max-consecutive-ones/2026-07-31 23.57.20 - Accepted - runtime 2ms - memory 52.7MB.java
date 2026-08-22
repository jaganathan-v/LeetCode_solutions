class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int digits=0,high=0;
    for(int n:nums){
        if(n == 1){
              digits++;
        }else{
            if(digits> high){
                high = digits;
            }
            digits =0;
        }
    }
     if(digits> high){
        high = digits;
     }
    return high;
    }
}
