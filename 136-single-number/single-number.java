class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer>  hm= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    for(int n:hm.keySet()){
        if(hm.get(n) == 1) return n;
    }  
    return 0; 
    }
}