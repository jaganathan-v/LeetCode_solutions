class Solution {
    public boolean isAnagram(String s, String t) {
    // HashMap<Character,Integer> hm = new HashMap<> ();
    // HashMap<Character,Integer> hm1 = new HashMap<> ();
    // for(char c : s.toCharArray()){
    //     hm.put(c,hm.getOrDefault(c,0)+1);
    // } 
    // for(char c : t.toCharArray()){
    //     hm1.put(c,hm1.getOrDefault(c,0)+1);
    // }
    // boolean isIdentical = hm.equals(hm1); 
    // return isIdentical;
    if(s.length()!= t.length()) return false;
    int[] arr = new int[26];
    for(int c:s.toCharArray()){
        arr[c - 'a']++;
    }
     for(int c:t.toCharArray()){
        arr[c - 'a']--;
    }
    for(int n:arr){
        if(n != 0){
            return false;
        }
    }
    return true;
    }
}