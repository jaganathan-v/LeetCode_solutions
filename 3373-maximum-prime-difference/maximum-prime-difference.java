class Solution {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i =2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
    int distance = 0;
    int left = 0;
    int right = nums.length-1;
    while(left<=right){
        if(isPrime(nums[left]) && isPrime(nums[right])){
            distance = right -left;
            return distance;
        }
        if(!isPrime(nums[left])){
            left++;
        }
        if(!isPrime(nums[right])){
			right--;;
		}
    }  
    return distance;
    }
}