class Solution {
    public int majorityElement(int[] nums) {

    // int count = 0;
    // int canditate = 0;
    // for(int n:nums){
    //     if(count == 0)  canditate = n;
    //     if(canditate == n) count++;
    //     else count--;
    // }
    // return canditate;

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }

    for(int n:nums){
        if(map.getOrDefault(n,0) > (nums.length/2)){
            return n;
        }
    }
    return nums[nums.length-1];
        }
}








