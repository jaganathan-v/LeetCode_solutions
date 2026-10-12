class Solution {
    public int sumOfSquares(int[] nums) {
    int length = nums.length;
    int sum = 0;
    for(int i=0;i<nums.length;i++){
        if(length % (i+1)== 0){
            int value = (nums[i] * nums[i]);
            sum+= value;
        }
    } 
    return sum;
    }
}