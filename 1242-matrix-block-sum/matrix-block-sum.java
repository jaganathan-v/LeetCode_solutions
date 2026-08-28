class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
     for(int i =0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            if(i==0 && j>0){
                mat[i][j]+= mat[i][j-1];
            }else if(i>0 && j==0){
                mat[i][j]+=mat[i-1][j];
            }else if(i>0 && j>0){
                mat[i][j]+=mat[i][j-1]+mat[i-1][j]-mat[i-1][j-1];
            }
        }
     }
     int[][] result = new int[mat.length][];
     for(int i=0;i<result.length;i++){
        result[i] = new int[mat[i].length];
          for(int j=0;j<mat[i].length;j++){
            int rowStart = Math.max(0, i-k);
            int rowEnd = Math.min(mat.length-1,i+k);
            int columnStart = Math.max(0,j-k);
            int columnEnd = Math.min(mat[i].length-1,j+k);
            result[i][j] = mat[rowEnd][columnEnd];
            if(rowStart>0) result[i][j]-=mat[rowStart-1][columnEnd];
            if(columnStart >0) result[i][j]-=mat[rowEnd][columnStart-1];
            if(rowStart >0 && columnStart >0) result[i][j]+=mat[rowStart-1][columnStart-1];
          }
     } 
     return result; 
    }
}