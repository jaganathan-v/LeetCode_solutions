class Solution {
    public int longestSubarray(int[] nums) {
    int high = 2;
    int count = 2;
    for(int i = 2 ; i<nums.length;i++ ){
     if(nums[i] == nums[i-1] +  nums[i-2]){
        count++;
     }else if(count>high){
        high = count;
        count = 2;
     }else{
        count =2;
     }
    } 
    if(count > high) return count;
    return high;   
    }
}