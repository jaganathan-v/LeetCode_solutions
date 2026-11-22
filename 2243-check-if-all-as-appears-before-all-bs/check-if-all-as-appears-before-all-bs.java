class Solution {
    public boolean checkString(String s) {
    boolean found = false;
    for(char ch:s.toCharArray()){
        if(ch == 'b' && !(found) ){
             found = true;
        }
        if(ch == 'a' && found){
            return false;
        }
    } 
    return true;
    }
}