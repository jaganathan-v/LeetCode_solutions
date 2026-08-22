class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();
    for(char ch:s.toCharArray()){ 
       if(ch=='(' || ch=='{' || ch=='['){ 
        stack.push(ch);
       }else if(ch==')'|| ch=='}' || ch==']'){ 
        if (stack.isEmpty()) {
          return false;
        }
        switch(ch){ 
            case '}':
                if(stack.pop()!='{'){
                      return false;
                }
                break;
            case ')':
                if(stack.pop()!='('){
                      return false;
                }
                break;
            case ']':
                if(stack.pop()!='['){
                      return false;
                }
                break;
        }
       }
    }
      if(stack.isEmpty()){ 
            return true;
        }else{ 
            return false;
        }
    }
}