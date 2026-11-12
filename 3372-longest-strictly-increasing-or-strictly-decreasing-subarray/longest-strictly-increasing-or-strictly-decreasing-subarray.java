class Solution {
    public int longestMonotonicSubarray(int[] nums) {
    int max_count = 1;
   
    for(int i=0;i<nums.length;i++){
         int increment_count = 1;
         int decrement_count = 1;
        for(int j=i;j<nums.length-1;j++){
          if(nums[j] < nums[j+1]){
             increment_count++;
          }else{
             max_count = Integer.max(max_count,increment_count);
             increment_count = 1;
          }

          if(nums[j] > nums[j+1]){
               decrement_count++;
          }else{
                 max_count = Integer.max(max_count,decrement_count);
                 decrement_count = 1;
          }
        }
          max_count = Integer.max(max_count,increment_count);
          max_count = Integer.max(max_count,decrement_count);
    }  
    return max_count;
    }
}