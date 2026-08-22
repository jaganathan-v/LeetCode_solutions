class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    HashSet<Integer> hs = new HashSet<>();
    List<Integer> ls = new ArrayList<>();
    for(int n:nums){
         hs.add(n);
    }
    for(int i=1;i<=nums.length;i++){
      if(!hs.contains(i)){
         ls.add(i);
      }
    }
    return ls;
    }
}