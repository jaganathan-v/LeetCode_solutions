class Solution {
    public int maxSubArray(int[] nums) {
    // int sum = 0;
    // int max = nums[0];
    // for(int i =0;i<nums.length;i++){
    //     sum+=nums[i];
    //     if(sum>max){
    //         max = sum;
    //     }
    //     if(sum<0) sum = 0;
    // }  
    // return max;  
    int max_value = nums[0];
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    for(int i=1;i<nums.length;i++){
        dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
        max_value = Math.max(max_value,dp[i]);
    }
    return max_value;
    }
}