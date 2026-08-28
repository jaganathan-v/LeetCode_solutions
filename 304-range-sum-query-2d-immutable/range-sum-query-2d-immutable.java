class NumMatrix {
   private int[][] result;
    public NumMatrix(int[][] matrix) {
        result = new int[matrix.length][];  
    for(int i=0;i<matrix.length;i++){
        result[i] = new int[matrix[i].length];
        for(int j=0;j<matrix[i].length;j++){
            if(i==0 && j==0) result[i][j] = matrix[i][j];
            if(i==0 && j>0) result[i][j] = result[i][j-1] + matrix[i][j];
            if(j == 0 && i>0) result[i][j] = result[i-1][j] + matrix[i][j];
            if(i>0 && j>0) result[i][j] = matrix[i][j] + result[i][j-1] + result[i-1][j] - result[i-1][j-1];
        }
    }    
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = result[row2][col2];
        int top = (row1>0)?result[row1-1][col2]:0;
        int left = (col1>0)?result[row2][col1-1]:0;
        int topleft = (row1>0 && col1>0)?result[row1-1][col1-1]:0;

        return total - top - left +topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */