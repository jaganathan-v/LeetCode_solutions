class Solution {
    public int lengthOfLastWord(String s) {
    char[] ch =s.toCharArray();
    int count=0;
    int i = s.length()-1;
    while(ch[i] == ' '){
        i--;
    }
    while(i>=0 && ch[i] !=' '){
        count++;
        i--;
    }
    return count;
    }
}