class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    int left = 0;
    HashSet<Integer> hs = new HashSet<>();
    for(int right = 0;right<nums.length;right++){
       if(right - left > k){
        hs.remove(nums[left]);
        left++;
       } 
       if(hs.contains(nums[right])){
        return true;
       }
       hs.add(nums[right]);
    }
    return false; 
    }
}