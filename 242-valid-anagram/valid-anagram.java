class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> hm = new HashMap<> ();
    HashMap<Character,Integer> hm1 = new HashMap<> ();
    for(char c : s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
    } 
    for(char c : t.toCharArray()){
        hm1.put(c,hm1.getOrDefault(c,0)+1);
    }
    boolean isIdentical = hm.equals(hm1); 
    return isIdentical;
    }
}