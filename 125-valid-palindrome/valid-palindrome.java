class Solution {
    public boolean isPalindrome(String s) {
    s =  s.toLowerCase();
    int i =0 ;
    char[] ch = new char[s.length()];
    for(char c:s.toCharArray()){
       if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
            ch[i] = c;
            i++;
        }
    }
    int left = 0;
    int right = i-1;
    boolean flag = true;
    while(left<right){
        if(ch[left] == ch[right]){
            left++;
            right--;
        }else{
            flag = false;
            return flag;
        }
    }
        return flag;
    }
}