class Solution {
    public int maxProduct(int[] nums) {
    Arrays.sort(nums);
    int n=nums[nums.length - 1];
    int m=nums[nums.length -2];
    return (n-1)*(m-1); 
    }
}