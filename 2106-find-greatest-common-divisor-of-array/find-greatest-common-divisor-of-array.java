class Solution {
    public int GCD(int a,int b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    public int findGCD(int[] nums) {
    int high = nums[0];
    int low = nums[0];
    for(int n:nums){
        if(n>high) high = n;
        if(n<low) low = n;
    } 
    return  GCD(low,high);  
    }
}