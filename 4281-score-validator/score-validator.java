class Solution {
    public int[] scoreValidator(String[] events) {
        int score= 0,counter = 0;
    for(String str:events){
        if(str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5")|| str.equals("6") ){
            score+=Integer.valueOf(str);
        }else if(str.equals("W")){
            counter+=1;
            if(counter == 10){
               break;
            } 
        }else{
            score+=1;
        }
    }  
    int[] arr = new int[2];
    arr[0] = score;
    arr[1] = counter;
    return arr;  
    }
}