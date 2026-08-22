class Solution {
    public String reversePrefix(String word, char ch) {
     Stack<Character> st=new Stack<>();
     char[] c=new char[word.length()];
     int i;
     c=word.toCharArray();
     for(i=0;i<word.length();i++){ 
        if(c[i] == ch){
           st.push(c[i]);
           
           break;
        }else{
            st.push(c[i]);
        }
     } 
     StringBuilder str=new StringBuilder();
     for(int j=0;j<word.length();j++){ 
        if(j>i){ 
            str.append(c[j]);
        }else{
          str.append(st.pop());
        }
     }
     if (i == word.length()) {
    return word;
    }

     return str.toString();
    }
}