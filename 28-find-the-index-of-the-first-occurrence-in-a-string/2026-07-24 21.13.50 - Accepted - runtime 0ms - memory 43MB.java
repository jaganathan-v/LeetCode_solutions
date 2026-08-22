class Solution {
    public int strStr(String haystack, String needle) {
        int left=0;
        int right =needle.length()-1;
     while(right < haystack.length()){
        if(needle.equals(haystack.substring(left,right+1))){ 
            return left;
        }else{
             left++;
             right++;
        }
     }
     return -1;   
    }
}