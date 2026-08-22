class Solution {
    public int majorityElement(int[] nums) {

    int count = 0;
    int canditate = 0;
    for(int n:nums){
        if(count == 0)  canditate = n;
        if(canditate == n) count++;
        else count--;
    }
    return canditate;
    }
}