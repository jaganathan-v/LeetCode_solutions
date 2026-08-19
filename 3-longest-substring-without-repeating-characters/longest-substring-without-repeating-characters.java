class Solution {
    public int lengthOfLongestSubstring(String s) {
    // char[] ch = s.toCharArray();
    // boolean flag = true;
    // int high = 0,i=0,j=0;
    // for( i =0 ;i<ch.length;i++){
    //     flag = true;
    //     int[] arr = new int[128];
    //     for(j=i;flag == true && j<ch.length;j++){
    //         arr[ch[j]]++;
    //         if(arr[ch[j]]>1){
    //              flag = false;
    //         }
    //     }
    //     int cl = flag ? (j - i) : (j - i - 1);
    //    if(cl>high) high = cl;
    // }  
    // return high;  
    int left =0;
    int max = 0;
    HashSet<Character> hs = new HashSet<>();
    for(int right =0;right<s.length();right++){
         char currentChar = s.charAt(right);
          
          while(hs.contains(s.charAt(right))){
            hs.remove(s.charAt(left));
            left++;
          }
          hs.add(s.charAt(right));
          max = Math.max(max,right-left +1); 
    }
    return max;
    }
}