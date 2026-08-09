class Solution {
    public static boolean isAnagram(String str1,String str2){
        int[] count = new int[26];
        for(char c:str1.toCharArray()){
            count[c - 'a']++;
        }
        for(char c:str2.toCharArray()){
            count[c - 'a']--;
        }
        for(int n:count){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
    List<String> ls = new ArrayList<>();
           ls.add(words[0]);
    for(int i=1;i<words.length;i++){
    if(!isAnagram(words[i],words[i-1])){
        ls.add(words[i]);
    }   
    }
    return ls;
    }
}