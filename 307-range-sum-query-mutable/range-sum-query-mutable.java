class NumArray {
   
    int[] tree;
    
    
    public NumArray(int[] nums) {
     tree = new int[4*nums.length];
     creation(nums,0,0,nums.length-1);
    }
    public void  creation(int[] nums,int node,int start,int end){
        if(start == end) {
        tree[node] = nums[start];
         return;
         }
        int middle = (start + end) /2;
        creation(nums,2*node+1,start,middle);
        creation(nums,2*node+2,middle+1,end);

        tree[node] = tree[2*node+1] + tree[2*node+2];
    }
    
    public void update(int index, int val) {
       update2(0,0,tree.length/4 -1,index,val);
    }
    
    public void update2(int node,int start,int end,int index,int val){
        if(start == end ){
            tree[node] = val;
            return;
        }
        int middle = (start + end) /2;
        if(index<=middle){
            update2(2*node+1,start,middle,index,val);
        }else{
            update2(2*node+2,middle+1,end,index,val);
        }
        tree[node] = tree[2*node+1] + tree[2*node+2];
    }
    public int sumRange(int left, int right) {
       return  sumrange(0,0,tree.length/4 -1,left,right);
    }
    public int sumrange(int node,int start,int end,int left,int right){
        if(right<start || left>end){
            return 0;
        }
        if(left<=start && end<=right ){
            return tree[node];
        }
        int middle = (start+end)/2;
        int leftsum = sumrange(2*node+1,start,middle,left,right);
        int rightsum = sumrange(2*node+2,middle+1,end,left,right);
        return leftsum+rightsum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */