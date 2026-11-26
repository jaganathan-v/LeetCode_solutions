class Solution {
    public boolean canAliceWin(int n) {
    if(n<10) return false;
    boolean alias_found = true;
   
    
    int current_value = 10;
    n -= current_value;
    while(alias_found){
      if(n >= --current_value){
        n-= current_value;
        alias_found = false;
         System.out.println(n);
      }
      if (n>= --current_value){
        n-=current_value;
         alias_found = true;
          System.out.println(n);
      }else{
        return alias_found;
      }
      System.out.println(n);
    }  
     return alias_found;
    }
}