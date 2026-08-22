class Solution {
    public static int operation(char c,int a,int b){ 
        switch(c){ 
            case '+': 
                return a+b;
            case '-':
                 return a-b;
            case '*':
                 return a*b;
            case '/':  
                 if(b==0){ 
                    return 0;
                 }
                 return a/b;
            default:
                  return 0;
            }
    }

    public static boolean isNum(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    public int evalRPN(String[] tokens) {
     Stack<Integer> st=new Stack<>();

    for(int i=0;i<tokens.length;i++){ 
        if(isNum(tokens[i])){

            st.push(Integer.valueOf(tokens[i]));

        }else if(tokens[i].charAt(0)=='+' || tokens[i].charAt(0)=='-' || tokens[i].charAt(0)=='*' || tokens[i].charAt(0)=='/' ){
            int n1=st.pop();
            int n2=st.pop();
           int result=operation(tokens[i].charAt(0),n2,n1);
           st.push(result);
        }  
    }
    int ans=st.pop();
    return ans;
    }
}