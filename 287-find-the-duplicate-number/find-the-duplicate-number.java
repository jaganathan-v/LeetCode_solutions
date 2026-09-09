class Solution {
    public int findDuplicate(int[] nums) {
    // int slowPointer = 0;
    // int fastPointer = 1;
    // while(slowPointer<nums.length){
    //     if(fastPointer>nums.length){
    //         slowPointer++;
    //         fastPointer = slowPointer;
    //     }else if(nums.length>fastPointer && nums[slowPointer] == nums[fastPointer]){
    //         return nums[slowPointer];
    //     }
    //     fastPointer++;
    // }   
    //  return nums[slowPointer]; 
    int i=0;
    while(i<nums.length){
        int index = nums[i] -1;
        if(nums[i] != nums[index]){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }else{
            i++;
        }
    }
    for(i=0;i<nums.length;i++){
        if(nums[i] != i+1){
            return nums[i];
        }
    }
        return 0;
    
    }
}