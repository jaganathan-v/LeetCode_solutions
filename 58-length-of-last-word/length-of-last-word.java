class Solution {
    public int lengthOfLastWord(String s) {
    char[] ch =s.toCharArray();
    int count=0;
    int i = s.length()-1;
    while(s.charAt(i) == ' '){
        i--;
    }
    while(i>=0 && s.charAt(i) !=' '){
        count++;
        i--;
    }
    return count;
    }
}