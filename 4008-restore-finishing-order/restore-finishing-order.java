class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    HashSet<Integer> hash = new HashSet<>();
    for(int i=0;i<friends.length;i++){
          hash.add(friends[i]);
    }
    int j=0;
    int[] result = new int[friends.length];
    for(int i=0;i<order.length;i++){
       if(hash.contains(order[i])){
        result[j] = order[i];
        j++;
       }
    }  
    return result;
    }
}