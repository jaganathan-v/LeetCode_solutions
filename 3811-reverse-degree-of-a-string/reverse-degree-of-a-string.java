class Solution {
    public int reverseDegree(String s) {
    int sum =0;
    int i =1;
    char[] arr = s.toCharArray();
     for(char c:arr){
        int value = (26 - (c -'a'))*i;

        sum+=value;
        i++;
     }  
     return sum; 
    }
}