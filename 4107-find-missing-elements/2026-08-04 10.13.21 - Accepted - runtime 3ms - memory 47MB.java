class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    int large = nums[0];
    int small = nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>large){
            large = nums[i];
        }
        if(nums[i]<small){
            small = nums[i];
        }
    } 
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
    }
    List<Integer> ls = new ArrayList<>();
    for(int i = small;i<large;i++){
        if(!hs.contains(i)){
            ls.add(i);
        }
    }
    return ls; 
    }
}