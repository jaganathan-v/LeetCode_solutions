class Solution {
    public void moveZeroes(int[] nums) {
    int numbers = 0;
    for(int traverse = 0;traverse<nums.length;traverse++){
        if(nums[traverse] != 0){
            int temp = nums[traverse];
            nums[traverse] = nums[numbers];
            nums[numbers] = temp;
            numbers++;
        }
    }  
    }
}