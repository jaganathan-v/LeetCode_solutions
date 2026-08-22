class Solution {
    public int maxDepth(String s) {
    Stack<Character> st=new Stack<>();
    int high=0,num=0;
    for(char c:s.toCharArray()){ 
        if(c == '('){ 
            st.push(c);
        }else if(c == ')'){ 
            num=st.size();
            st.pop();
            if(num>high){
                high=num;
            }
        }
    } 
    return high;
    }
}