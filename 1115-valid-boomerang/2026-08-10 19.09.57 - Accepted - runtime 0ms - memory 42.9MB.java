class Solution {
    public boolean isBoomerang(int[][] points) {
    int x1=0,x2=0,x3=0;
    int y1=0,y2=0,y3=0;
    for(int i =0;i<points.length;i++){
        for(int j=0;j<points[i].length-1;j++){
           if(i==0){
            x1 = points[i][j];
            y1 = points[i][j+1];
           }else if(i == 1){
             x2 = points[i][j];
             y2 = points[i][j+1];
           }else{
            x3 = points[i][j];
            y3 = points[i][j+1];
           }
        }
    } 
    return !((y2-y1)*(x3-x1) == (y3 - y1)*(x2-x1));   
    }
}