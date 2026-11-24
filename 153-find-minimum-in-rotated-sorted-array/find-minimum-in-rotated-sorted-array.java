class Solution {
    public int findMin(int[] nums) {
    //  int left = 0;
    //  int right = nums.length -1;
    //  while(left<right){
    //     int middle = left + (right - left)/2;
    //     if(nums[middle]<nums[middle+1] && nums[middle]>nums[middle-1]){
    //         return nums[middle];
    //     }else if(nums[middle] > nums[0] && nums[middle] < nums[nums.length-1]){
    //         left++;
    //     }else {
    //         right--;
    //     }
    //  }  
    //  return nums[left];

    int left = 0;
    int right = nums.length -1 ;
    while(left<right){
        int middle = left + ( right - left )/2;
        if(nums[middle]>nums[right]){
            left = middle +1;
        }else{
            right = middle;
        }
    }
    return nums[left];
    }
}